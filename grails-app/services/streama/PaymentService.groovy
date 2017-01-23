package streama

import grails.transaction.Transactional
import org.apache.commons.codec.binary.Base64
import org.apache.commons.codec.digest.DigestUtils
import tns.ns.LnmoCheckoutService
import tns.ns.ProcessCheckOutResponse
import tns.ns.TransactionConfirmRequest
import tns.ns.TransactionConfirmResponse
import tns.ns.TransactionStatusRequest
import tns.ns.TransactionStatusResponse

import static java.util.UUID.randomUUID;
import tns.ns.CheckOutHeader
import tns.ns.ProcessCheckOutRequest
import tns.ns.LNMOPortType;

@Transactional
class PaymentService {
  static {

  }

  def lnmoCheckOutService = new LnmoCheckoutService();
  def lnmoPortType = lnmoCheckOutService.lnmoCheckout;

    def serviceMethod(String phoneNumber,float amount) {
      User user;
      if(phoneNumber && amount){
        user = User.findByPhoneNumber(phoneNumber);
        if(user == null)
          return false;
        makeMpesaPayment(user,amount);
      }
    }

  def makeMpesaPayment(User user, long amount){
    //fake request
    user.totalBalance += amount;
    user.validate();
    if(user.subscribedStatus && !user.hasErrors()){
      user.save(flush: true);
      return true;
    }
    UserSubscription subscription = new UserSubscription(user.totalBalance, user);
    subscription.validate();
    if(!subscription.hasErrors()){
      user.totalBalance = subscription.user.totalBalance;
      user.subscribedStatus = subscription.user.subscribedStatus;
      user.validate();
      if(!user.hasErrors()){
        subscription.save flush:true;
        user.save flush: true;
        return true;
      }else{
        return false;
      }
    }
    return false;
  }

  static protected String passwordEncoder(String merchantId, String passkey, String timestamp){
    String password = merchantId + passkey + timestamp;
    password = DigestUtils.sha256(password).toString().toUpperCase();
    return Base64.encodeBase64(password.bytes);

  }

  static protected CheckOutHeader createCheckoutHeader(){
    CheckOutHeader checkOutHeader = new CheckOutHeader();
    //TODO: Store MERCHANT_ID in settings Database
    checkOutHeader.setMERCHANTID("MERCHANT_ID");
    checkOutHeader.setTIMESTAMP(new Date().toTimestamp().toString());
    checkOutHeader.setPASSWORD(passwordEncoder('MERCHANT_ID', 'PASSKEY',checkOutHeader.TIMESTAMP));
    return checkOutHeader;
  }

  def MpesaPaymentRequest(User user, float amount){
    CheckOutHeader checkOutHeader = createCheckoutHeader();
    //processCheckout
    ProcessCheckOutRequest processCheckOutRequest = new ProcessCheckOutRequest();
    String merchantTrxId = randomUUID() as String;
    processCheckOutRequest.setMERCHANTTRANSACTIONID(merchantTrxId);
    processCheckOutRequest.setTIMESTAMP(checkOutHeader.TIMESTAMP);
    processCheckOutRequest.setAMOUNT(amount);
    processCheckOutRequest.setMSISDN(user.phoneNumber);
    //TODO: how do we tell which plan user is in currently
    processCheckOutRequest.setREFERENCEID('wiflix@50daily');
    //TODO: how do we collect ip address correctly and place it here ()
    processCheckOutRequest.setCALLBACKURL(InetAddress.localHost.hostAddress + "/PaymentService/callMeBack");
    processCheckOutRequest.setCALLBACKMETHOD("HTTP POST");

    ProcessCheckOutResponse checkOutResponse = lnmoPortType.processCheckOut(processCheckOutRequest,checkOutHeader);
    //the best way to go about this is to start with error responses that we cannot handle e.g error IN M-PESA server
    String retCode = checkOutResponse.RETURNCODE;
    String trxId;
    String customMsg;
    if(retCode == '00'){
      trxId = checkOutResponse.getTRXID(); //TODO: trxId need to be kept safe any ideas 1.(pass it to client) 2.()
      customMsg = checkOutResponse.getCUSTMSG();
      TransactionConfirmRequest confirmRequest = new TransactionConfirmRequest();
      confirmRequest.setMERCHANTTRANSACTIONID(merchantTrxId);
      confirmRequest.setTRXID(trxId);
      TransactionConfirmResponse confirmResponse = lnmoPortType.confirmTransaction(confirmRequest,checkOutHeader);
      if(confirmResponse.RETURNCODE == "00"){
        return [success:true, trxId: trxId, customerMsg: customMsg];
      }else{
        return statusErrorCodes(confirmResponse.RETURNCODE,confirmResponse.getDESCRIPTION());
      }
    }else{
      return statusErrorCodes(retCode, checkOutResponse.getDESCRIPTION());
    }

  }


  def verifyMpesa(String trxId, String merchantTrxId){
    TransactionStatusRequest statusRequest = new TransactionStatusRequest();
    statusRequest.setMERCHANTTRANSACTIONID(merchantTrxId);
    statusRequest.setTRXID(trxId);
    TransactionStatusResponse statusResponse = lnmoPortType.transactionStatusQuery(statusRequest,createCheckoutHeader());
    String returnCode = statusResponse.getRETURNCODE();
    if(returnCode == '00'){// more to this than just the map
      return [success: true, amount: statusResponse.getAMOUNT()];
    }else{
      statusErrorCodes(returnCode, statusResponse.getDESCRIPTION());
    }

  }

  protected Map statusErrorCodes(String returnCode, String description){ //TODO: how does these work for error's only or what
    def result = [:];
    switch(returnCode){
      case '01':
      case '03':
      case '04':
      case '08':
      case '10':
        //TODO: Deal with this user errors today
        result = [success: false, message: description];
        break;
      case '05': //TODO: Transaction expired wasn't picked up in time repeat again new TRX_ID and MERCHANT_TRX_ID will emerge
      case '06': //TODO: create a  5 min timeout and reapeate everything
      case '11':
      case '29': //case 29 can be added here since mpesa system is facing downtime maybe we should try later after 5-10 min
        result = [success: false, message: " an error occured a new Transaction has been created please try again in 5 min"];
        break;
      case '12': //TODO:  trx details are diff from orginal captured trx details what are we doing wrong log and find the problem
        break;
      case '09'://TODO: errors on our part Wiflix log and handle them they are loosing us Money
      case '30':
      case '31':
      case '32':
      case '33':
      case '36':
      case '40':
      case '41':
        return;
        break;
      case '34': //TODO: request processing delay how do we go about this
        result = [success: false, message:"Mpesa server are experiencing delay please wait while your request is being processed"]
        break;
      case '35': //TODO: duplicate request was detected how do we deal with this
        break;
    }

  }


  def requestKillbillMpesaPaymentRequest(User user, float amount){
    //killbill payment request

    //fake return
    return true;
  }


}
