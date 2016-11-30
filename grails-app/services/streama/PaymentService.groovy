package streama

import grails.transaction.Transactional
import wslite.soap.*

@Transactional
class PaymentService {

    def serviceMethod() {

    }

  def makeMpesaPayment(String phoneNumber, float amount){
    //fake request

    //fake return
    return true;
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
