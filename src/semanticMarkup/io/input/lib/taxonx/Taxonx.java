//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.11 at 02:48:30 PM MST 
//


package semanticMarkup.io.input.lib.taxonx;

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
 *         &lt;element name="taxonxHeader" type="{http://www.taxonx.org/schema/v1}taxonxHeader"/>
 *         &lt;element name="taxonxBody" type="{http://www.taxonx.org/schema/v1}taxonxBody"/>
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
    "taxonxHeader",
    "taxonxBody"
})
@XmlRootElement(name = "taxonx", namespace = "http://www.taxonx.org/schema/v1")
public class Taxonx {

    @XmlElement(namespace = "http://www.taxonx.org/schema/v1", required = true)
    protected TaxonxHeader taxonxHeader;
    @XmlElement(namespace = "http://www.taxonx.org/schema/v1", required = true)
    protected TaxonxBody taxonxBody;

    /**
     * Gets the value of the taxonxHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TaxonxHeader }
     *     
     */
    public TaxonxHeader getTaxonxHeader() {
        return taxonxHeader;
    }

    /**
     * Sets the value of the taxonxHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxonxHeader }
     *     
     */
    public void setTaxonxHeader(TaxonxHeader value) {
        this.taxonxHeader = value;
    }

    /**
     * Gets the value of the taxonxBody property.
     * 
     * @return
     *     possible object is
     *     {@link TaxonxBody }
     *     
     */
    public TaxonxBody getTaxonxBody() {
        return taxonxBody;
    }

    /**
     * Sets the value of the taxonxBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxonxBody }
     *     
     */
    public void setTaxonxBody(TaxonxBody value) {
        this.taxonxBody = value;
    }

}
