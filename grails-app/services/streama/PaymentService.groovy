package streama

import grails.transaction.Transactional

@Transactional
class PaymentService {

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
        subscription.save flush:true;//TODO: what's the meaning of flush!
        user.save flush: true;
        return true;
      }else{
        return false;
      }
    }
    return false;
  }

  def initializeMpesaPaymentRequest(String phoneNumber, float amount){
    //fake request

    //fake return
    return true;
  }

  def requestKillbillMpesaPaymentRequest(User user, float amount){
    //killbill payment request

    //fake return
    return true;
  }


}
