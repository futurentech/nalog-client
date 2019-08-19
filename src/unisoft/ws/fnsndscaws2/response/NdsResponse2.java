
package unisoft.ws.fnsndscaws2.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="NP" maxOccurs="10000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="INN" use="required" type="{http://ws.unisoft/FNSNDSCAWS2/Response}ÈÍÍÒèï" />
 *                 &lt;attribute name="KPP" type="{http://ws.unisoft/FNSNDSCAWS2/Response}ÊÏÏÒèï" />
 *                 &lt;attribute name="DT" type="{http://ws.unisoft/FNSNDSCAWS2/Response}ÄàòàÒèï" />
 *                 &lt;attribute name="State" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="0"/>
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                       &lt;enumeration value="3"/>
 *                       &lt;enumeration value="4"/>
 *                       &lt;enumeration value="5"/>
 *                       &lt;enumeration value="6"/>
 *                       &lt;enumeration value="7"/>
 *                       &lt;enumeration value="8"/>
 *                       &lt;enumeration value="9"/>
 *                       &lt;enumeration value="10"/>
 *                       &lt;enumeration value="11"/>
 *                       &lt;enumeration value="12"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="DTActUL" type="{http://ws.unisoft/FNSNDSCAWS2/Response}ÄàòàÒèï" />
 *       &lt;attribute name="DTActFL" type="{http://ws.unisoft/FNSNDSCAWS2/Response}ÄàòàÒèï" />
 *       &lt;attribute name="errMsg" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "np"
})
@XmlRootElement(name = "NdsResponse2")
public class NdsResponse2 {

    @XmlElement(name = "NP")
    protected List<NdsResponse2 .NP> np;
    @XmlAttribute(name = "DTActUL")
    protected String dtActUL;
    @XmlAttribute(name = "DTActFL")
    protected String dtActFL;
    @XmlAttribute(name = "errMsg")
    @XmlSchemaType(name = "anySimpleType")
    protected String errMsg;

    /**
     * Gets the value of the np property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the np property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NdsResponse2 .NP }
     * 
     * 
     */
    public List<NdsResponse2 .NP> getNP() {
        if (np == null) {
            np = new ArrayList<NdsResponse2 .NP>();
        }
        return this.np;
    }

    /**
     * Gets the value of the dtActUL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTActUL() {
        return dtActUL;
    }

    /**
     * Sets the value of the dtActUL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTActUL(String value) {
        this.dtActUL = value;
    }

    /**
     * Gets the value of the dtActFL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTActFL() {
        return dtActFL;
    }

    /**
     * Sets the value of the dtActFL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTActFL(String value) {
        this.dtActFL = value;
    }

    /**
     * Gets the value of the errMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * Sets the value of the errMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsg(String value) {
        this.errMsg = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="INN" use="required" type="{http://ws.unisoft/FNSNDSCAWS2/Response}ÈÍÍÒèï" />
     *       &lt;attribute name="KPP" type="{http://ws.unisoft/FNSNDSCAWS2/Response}ÊÏÏÒèï" />
     *       &lt;attribute name="DT" type="{http://ws.unisoft/FNSNDSCAWS2/Response}ÄàòàÒèï" />
     *       &lt;attribute name="State" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="0"/>
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *             &lt;enumeration value="3"/>
     *             &lt;enumeration value="4"/>
     *             &lt;enumeration value="5"/>
     *             &lt;enumeration value="6"/>
     *             &lt;enumeration value="7"/>
     *             &lt;enumeration value="8"/>
     *             &lt;enumeration value="9"/>
     *             &lt;enumeration value="10"/>
     *             &lt;enumeration value="11"/>
     *             &lt;enumeration value="12"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NP {

        @XmlAttribute(name = "INN", required = true)
        protected String inn;
        @XmlAttribute(name = "KPP")
        protected String kpp;
        @XmlAttribute(name = "DT")
        protected String dt;
        @XmlAttribute(name = "State", required = true)
        protected String state;

        /**
         * Gets the value of the inn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINN() {
            return inn;
        }

        /**
         * Sets the value of the inn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINN(String value) {
            this.inn = value;
        }

        /**
         * Gets the value of the kpp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKPP() {
            return kpp;
        }

        /**
         * Sets the value of the kpp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKPP(String value) {
            this.kpp = value;
        }

        /**
         * Gets the value of the dt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDT() {
            return dt;
        }

        /**
         * Sets the value of the dt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDT(String value) {
            this.dt = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
        }

    }

}
