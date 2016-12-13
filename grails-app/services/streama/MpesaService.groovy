package streama

import grails.transaction.Transactional
import org.grails.cxf.soap.C2BPaymentConfirmationRequest

import javax.jws.WebService

import org.grails.cxf.utils.EndpointType

import org.grails.cxf.soap.C2BPaymentValidationAndConfirmationService;
import org.grails.cxf.soap.C2BPaymentValidationAndComfirmation;


@Transactional
class MpesaService {

    def serviceMethod() {
      C2BPaymentConfirmationRequest c2bRequest = new C2BPaymentConfirmationRequest();
      c2bRequest.setMSISDN("0721169392");
      c2bRequest.setBusinessShortCode("220220");
      C2BPaymentValidationAndConfirmationService c2b = new C2BPaymentValidationAndConfirmationService()
      C2BPaymentValidationAndComfirmation c2bSoap = c2b.getC2BPaymentValidationAndConfirmationServicePort();
      c2bSoap.confirmC2BPayment(c2bRequest);
    }
}
