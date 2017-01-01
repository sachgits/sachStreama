
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
 *         &lt;element name="MERCHANT_TRANSACTION_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REFERENCE_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ENC_PARAMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CALL_BACK_URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CALL_BACK_METHOD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIMESTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "merchanttransactionid",
    "referenceid",
    "amount",
    "msisdn",
    "encparams",
    "callbackurl",
    "callbackmethod",
    "timestamp"
})
@XmlRootElement(name = "processCheckOutRequest")
public class ProcessCheckOutRequest {

    @XmlElement(name = "MERCHANT_TRANSACTION_ID", required = true)
    protected String merchanttransactionid;
    @XmlElement(name = "REFERENCE_ID", required = true)
    protected String referenceid;
    @XmlElement(name = "AMOUNT")
    protected double amount;
    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "ENC_PARAMS")
    protected String encparams;
    @XmlElement(name = "CALL_BACK_URL", required = true)
    protected String callbackurl;
    @XmlElement(name = "CALL_BACK_METHOD", required = true)
    protected String callbackmethod;
    @XmlElement(name = "TIMESTAMP")
    protected String timestamp;

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
     * Gets the value of the referenceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCEID() {
        return referenceid;
    }

    /**
     * Sets the value of the referenceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCEID(String value) {
        this.referenceid = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAMOUNT(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the encparams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENCPARAMS() {
        return encparams;
    }

    /**
     * Sets the value of the encparams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENCPARAMS(String value) {
        this.encparams = value;
    }

    /**
     * Gets the value of the callbackurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALLBACKURL() {
        return callbackurl;
    }

    /**
     * Sets the value of the callbackurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALLBACKURL(String value) {
        this.callbackurl = value;
    }

    /**
     * Gets the value of the callbackmethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALLBACKMETHOD() {
        return callbackmethod;
    }

    /**
     * Sets the value of the callbackmethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALLBACKMETHOD(String value) {
        this.callbackmethod = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIMESTAMP() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIMESTAMP(String value) {
        this.timestamp = value;
    }

}
