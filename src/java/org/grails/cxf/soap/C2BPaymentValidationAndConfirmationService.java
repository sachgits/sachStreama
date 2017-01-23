package org.grails.cxf.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2016-11-30T23:41:31.796+03:00
 * Generated source version: 3.0.4
 * 
 */
@WebServiceClient(name = "C2BPaymentValidationAndConfirmationService", 
                  wsdlLocation = "file:src/java/C2BPaymentValidationAndConfirmation.wsdl",
                  targetNamespace = "http://cps.huawei.com/cpsinterface/c2bpayment") 
public class C2BPaymentValidationAndConfirmationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://cps.huawei.com/cpsinterface/c2bpayment", "C2BPaymentValidationAndConfirmationService");
    public final static QName C2BPaymentValidationAndConfirmationServicePort = new QName("http://cps.huawei.com/cpsinterface/c2bpayment", "C2BPaymentValidationAndConfirmationServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:src/java/C2BPaymentValidationAndConfirmation.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(C2BPaymentValidationAndConfirmationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:src/java/C2BPaymentValidationAndConfirmation.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public C2BPaymentValidationAndConfirmationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public C2BPaymentValidationAndConfirmationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public C2BPaymentValidationAndConfirmationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public C2BPaymentValidationAndConfirmationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public C2BPaymentValidationAndConfirmationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public C2BPaymentValidationAndConfirmationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns C2BPaymentValidationAndComfirmation
     */
    @WebEndpoint(name = "C2BPaymentValidationAndConfirmationServicePort")
    public C2BPaymentValidationAndComfirmation getC2BPaymentValidationAndConfirmationServicePort() {
        return super.getPort(C2BPaymentValidationAndConfirmationServicePort, C2BPaymentValidationAndComfirmation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns C2BPaymentValidationAndComfirmation
     */
    @WebEndpoint(name = "C2BPaymentValidationAndConfirmationServicePort")
    public C2BPaymentValidationAndComfirmation getC2BPaymentValidationAndConfirmationServicePort(WebServiceFeature... features) {
        return super.getPort(C2BPaymentValidationAndConfirmationServicePort, C2BPaymentValidationAndComfirmation.class, features);
    }

}