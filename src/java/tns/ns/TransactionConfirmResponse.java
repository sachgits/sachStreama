
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
 *         &lt;element name="RETURN_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MERCHANT_TRANSACTION_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TRX_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "returncode",
    "description",
    "merchanttransactionid",
    "trxid"
})
@XmlRootElement(name = "transactionConfirmResponse")
public class TransactionConfirmResponse {

    @XmlElement(name = "RETURN_CODE", required = true)
    protected String returncode;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;
    @XmlElement(name = "MERCHANT_TRANSACTION_ID", required = true)
    protected String merchanttransactionid;
    @XmlElement(name = "TRX_ID", required = true)
    protected String trxid;

    /**
     * Gets the value of the returncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRETURNCODE() {
        return returncode;
    }

    /**
     * Sets the value of the returncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRETURNCODE(String value) {
        this.returncode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
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

}
