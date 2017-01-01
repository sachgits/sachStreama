
package tns.ns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tns.ns package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResponseMsg_QNAME = new QName("tns:ns", "ResponseMsg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tns.ns
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessCheckOutResponse }
     * 
     */
    public ProcessCheckOutResponse createProcessCheckOutResponse() {
        return new ProcessCheckOutResponse();
    }

    /**
     * Create an instance of {@link TransactionConfirmResponse }
     * 
     */
    public TransactionConfirmResponse createTransactionConfirmResponse() {
        return new TransactionConfirmResponse();
    }

    /**
     * Create an instance of {@link TransactionStatusResponse }
     * 
     */
    public TransactionStatusResponse createTransactionStatusResponse() {
        return new TransactionStatusResponse();
    }

    /**
     * Create an instance of {@link ResultMsg }
     * 
     */
    public ResultMsg createResultMsg() {
        return new ResultMsg();
    }

    /**
     * Create an instance of {@link TransactionConfirmRequest }
     * 
     */
    public TransactionConfirmRequest createTransactionConfirmRequest() {
        return new TransactionConfirmRequest();
    }

    /**
     * Create an instance of {@link ProcessCheckOutRequest }
     * 
     */
    public ProcessCheckOutRequest createProcessCheckOutRequest() {
        return new ProcessCheckOutRequest();
    }

    /**
     * Create an instance of {@link CheckOutHeader }
     * 
     */
    public CheckOutHeader createCheckOutHeader() {
        return new CheckOutHeader();
    }

    /**
     * Create an instance of {@link TransactionStatusRequest }
     * 
     */
    public TransactionStatusRequest createTransactionStatusRequest() {
        return new TransactionStatusRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns:ns", name = "ResponseMsg")
    public JAXBElement<String> createResponseMsg(String value) {
        return new JAXBElement<String>(_ResponseMsg_QNAME, String.class, null, value);
    }

}
