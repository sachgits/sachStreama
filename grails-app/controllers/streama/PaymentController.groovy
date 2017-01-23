package streama

import tns.ns.*;
import adhocclient2.SSLUtilities;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.binary.Base64;
import static java.util.UUID.randomUUID;

class PaymentController {
  static {

  }
  def lnmoCheckoutService = new LnmoCheckoutService();
  def lnmoPortType = lnmoCheckoutService.getLnmoCheckout();

  def springSecurityService
  def paymentService

    def index() {
      //it's here where user select's diff payment options e.g paypal mpesa creditcard
    }

  def mpesa(){

  }

  def mpesaPayment(){
    User user = springSecurityService.currentUser;
    def result = [:];
    result = paymentService.makeMpesaPayment(user, 50);
    if(!result.success){
     response.setStatus(PAYMENT_REQUIRED.value);
    }
    else{
      response.setStatus(PAYMENT_REQUIRED.value);
    }
    respond(result);
  }

  def veriyMpesa(String trxId, String merchantTrxId){
    //check to see if user has made payment to mpesa server or any recieved payment
    //money in the bank
    //include user url to return him to after payment have been made
    def result = [:];
    result = paymentService.verifyMpesa(trxId,merchantTrxId);
    if(result.success){
      response.setStatus(OK);
    }else{
      response.setStatus(PAYMENT_REQUIRED.value)
    }

    respond(result);

  }
}
