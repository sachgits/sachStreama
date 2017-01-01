
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
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MPESA_TRX_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MPESA_TRX_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TRX_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RETURN_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MERCHANT_TRANSACTION_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ENC_PARAMS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "msisdn",
    "amount",
    "mpesatrxdate",
    "mpesatrxid",
    "trxstatus",
    "returncode",
    "description",
    "merchanttransactionid",
    "encparams",
    "trxid"
})
@XmlRootElement(name = "ResultMsg")
public class ResultMsg {

    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "AMOUNT", required = true)
    protected String amount;
    @XmlElement(name = "MPESA_TRX_DATE", required = true)
    protected String mpesatrxdate;
    @XmlElement(name = "MPESA_TRX_ID", required = true)
    protected String mpesatrxid;
    @XmlElement(name = "TRX_STATUS", required = true)
    protected String trxstatus;
    @XmlElement(name = "RETURN_CODE", required = true)
    protected String returncode;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;
    @XmlElement(name = "MERCHANT_TRANSACTION_ID", required = true)
    protected String merchanttransactionid;
    @XmlElement(name = "ENC_PARAMS", required = true)
    protected String encparams;
    @XmlElement(name = "TRX_ID", required = true)
    protected String trxid;

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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNT(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the mpesatrxdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPESATRXDATE() {
        return mpesatrxdate;
    }

    /**
     * Sets the value of the mpesatrxdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPESATRXDATE(String value) {
        this.mpesatrxdate = value;
    }

    /**
     * Gets the value of the mpesatrxid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPESATRXID() {
        return mpesatrxid;
    }

    /**
     * Sets the value of the mpesatrxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPESATRXID(String value) {
        this.mpesatrxid = value;
    }

    /**
     * Gets the value of the trxstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRXSTATUS() {
        return trxstatus;
    }

    /**
     * Sets the value of the trxstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRXSTATUS(String value) {
        this.trxstatus = value;
    }

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
