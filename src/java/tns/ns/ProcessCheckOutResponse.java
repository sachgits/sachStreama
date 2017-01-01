
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
 *         &lt;element name="TRX_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ENC_PARAMS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUST_MSG" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "trxid",
    "encparams",
    "custmsg"
})
@XmlRootElement(name = "processCheckOutResponse")
public class ProcessCheckOutResponse {

    @XmlElement(name = "RETURN_CODE", required = true)
    protected String returncode;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;
    @XmlElement(name = "TRX_ID", required = true)
    protected String trxid;
    @XmlElement(name = "ENC_PARAMS", required = true)
    protected String encparams;
    @XmlElement(name = "CUST_MSG", required = true)
    protected String custmsg;

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
     * Gets the value of the custmsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTMSG() {
        return custmsg;
    }

    /**
     * Sets the value of the custmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTMSG(String value) {
        this.custmsg = value;
    }

}
