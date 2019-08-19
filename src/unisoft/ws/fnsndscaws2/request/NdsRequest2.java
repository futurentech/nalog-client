
package unisoft.ws.fnsndscaws2.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="NP" maxOccurs="10000">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="INN" use="required" type="{http://ws.unisoft/FNSNDSCAWS2/Request}ÈÍÍÒèï" />
 *                 &lt;attribute name="KPP" type="{http://ws.unisoft/FNSNDSCAWS2/Request}ÊÏÏÒèï" />
 *                 &lt;attribute name="DT" type="{http://ws.unisoft/FNSNDSCAWS2/Request}ÄàòàÒèï" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "np"
})
@XmlRootElement(name = "NdsRequest2")
public class NdsRequest2 {

    @XmlElement(name = "NP", required = true)
    protected List<NdsRequest2 .NP> np;

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
     * {@link NdsRequest2 .NP }
     * 
     * 
     */
    public List<NdsRequest2 .NP> getNP() {
        if (np == null) {
            np = new ArrayList<NdsRequest2 .NP>();
        }
        return this.np;
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
     *       &lt;attribute name="INN" use="required" type="{http://ws.unisoft/FNSNDSCAWS2/Request}ÈÍÍÒèï" />
     *       &lt;attribute name="KPP" type="{http://ws.unisoft/FNSNDSCAWS2/Request}ÊÏÏÒèï" />
     *       &lt;attribute name="DT" type="{http://ws.unisoft/FNSNDSCAWS2/Request}ÄàòàÒèï" />
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

    }

}
