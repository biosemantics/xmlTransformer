//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.11 at 02:48:30 PM MST 
//


package semanticMarkup.io.input.lib.taxonx;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Essentially, a representation of the "where" clause as a tree.
 * 
 * <p>Java class for filter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://digir.net/schema/protocol/2003/1.0}COP"/>
 *         &lt;element ref="{http://digir.net/schema/protocol/2003/1.0}LOP"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filter", namespace = "http://digir.net/schema/protocol/2003/1.0", propOrder = {
    "cop",
    "lop"
})
public class Filter {

    @XmlElementRef(name = "COP", namespace = "http://digir.net/schema/protocol/2003/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends COP> cop;
    @XmlElementRef(name = "LOP", namespace = "http://digir.net/schema/protocol/2003/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LOP> lop;

    /**
     * Gets the value of the cop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COP }{@code >}
     *     {@link JAXBElement }{@code <}{@link LessThanOrEquals }{@code >}
     *     {@link JAXBElement }{@code <}{@link Equals }{@code >}
     *     {@link JAXBElement }{@code <}{@link Like }{@code >}
     *     {@link JAXBElement }{@code <}{@link GreaterThan }{@code >}
     *     {@link JAXBElement }{@code <}{@link LessThan }{@code >}
     *     {@link JAXBElement }{@code <}{@link GreaterThanOrEquals }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotEquals }{@code >}
     *     {@link JAXBElement }{@code <}{@link In }{@code >}
     *     
     */
    public JAXBElement<? extends COP> getCOP() {
        return cop;
    }

    /**
     * Sets the value of the cop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COP }{@code >}
     *     {@link JAXBElement }{@code <}{@link LessThanOrEquals }{@code >}
     *     {@link JAXBElement }{@code <}{@link Equals }{@code >}
     *     {@link JAXBElement }{@code <}{@link Like }{@code >}
     *     {@link JAXBElement }{@code <}{@link GreaterThan }{@code >}
     *     {@link JAXBElement }{@code <}{@link LessThan }{@code >}
     *     {@link JAXBElement }{@code <}{@link GreaterThanOrEquals }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotEquals }{@code >}
     *     {@link JAXBElement }{@code <}{@link In }{@code >}
     *     
     */
    public void setCOP(JAXBElement<? extends COP> value) {
        this.cop = value;
    }

    /**
     * Gets the value of the lop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link And }{@code >}
     *     {@link JAXBElement }{@code <}{@link LOP }{@code >}
     *     {@link JAXBElement }{@code <}{@link Or }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrNot }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndNot }{@code >}
     *     
     */
    public JAXBElement<? extends LOP> getLOP() {
        return lop;
    }

    /**
     * Sets the value of the lop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link And }{@code >}
     *     {@link JAXBElement }{@code <}{@link LOP }{@code >}
     *     {@link JAXBElement }{@code <}{@link Or }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrNot }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndNot }{@code >}
     *     
     */
    public void setLOP(JAXBElement<? extends LOP> value) {
        this.lop = value;
    }

}
