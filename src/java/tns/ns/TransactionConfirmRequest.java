
package tns.ns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRX_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MERCHANT_TRANSACTION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trxid",
    "merchanttransactionid"
})
@XmlRootElement(name = "transactionConfirmRequest")
public class TransactionConfirmRequest {

    @XmlElement(name = "TRX_ID")
    protected String trxid;
    @XmlElement(name = "MERCHANT_TRANSACTION_ID")
    protected String merchanttransactionid;

    /**
     * Gets the value of the trxid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRXID() {
        return trxid;
    }

    /**
     * Sets the value of the trxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRXID(String value) {
        this.trxid = value;
    }

    /**
     * Gets the value of the merchanttransactionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMERCHANTTRANSACTIONID() {
        return merchanttransactionid;
    }

    /**
     * Sets the value of the merchanttransactionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMERCHANTTRANSACTIONID(String value) {
        this.merchanttransactionid = value;
    }

}
