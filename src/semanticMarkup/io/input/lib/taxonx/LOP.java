//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.11 at 02:48:30 PM MST 
//


package semanticMarkup.io.input.lib.taxonx;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The logical operator defined type.  An LOP can contain 2 of either COPs or LOPs (i.e. LOPs can be nested).
 * 
 * <p>Java class for LOP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="2" minOccurs="2">
 *         &lt;element ref="{http://digir.net/schema/protocol/2003/1.0}COP"/>
 *         &lt;element ref="{http://digir.net/schema/protocol/2003/1.0}LOP"/>
 *       &lt;/choice>
 *       &lt;attribute name="syntax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOP", namespace = "http://digir.net/schema/protocol/2003/1.0", propOrder = {
    "copOrLOP"
})
@XmlSeeAlso({
    Or.class,
    OrNot.class,
    And.class,
    AndNot.class
})
public class LOP {

    @XmlElementRefs({
        @XmlElementRef(name = "COP", namespace = "http://digir.net/schema/protocol/2003/1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LOP", namespace = "http://digir.net/schema/protocol/2003/1.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> copOrLOP;
    @XmlAttribute(name = "syntax")
    protected String syntax;

    /**
     * Gets the value of the copOrLOP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copOrLOP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOPOrLOP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link COP }{@code >}
     * {@link JAXBElement }{@code <}{@link LessThanOrEquals }{@code >}
     * {@link JAXBElement }{@code <}{@link LOP }{@code >}
     * {@link JAXBElement }{@code <}{@link Equals }{@code >}
     * {@link JAXBElement }{@code <}{@link And }{@code >}
     * {@link JAXBElement }{@code <}{@link Or }{@code >}
     * {@link JAXBElement }{@code <}{@link Like }{@code >}
     * {@link JAXBElement }{@code <}{@link AndNot }{@code >}
     * {@link JAXBElement }{@code <}{@link GreaterThan }{@code >}
     * {@link JAXBElement }{@code <}{@link LessThan }{@code >}
     * {@link JAXBElement }{@code <}{@link GreaterThanOrEquals }{@code >}
     * {@link JAXBElement }{@code <}{@link NotEquals }{@code >}
     * {@link JAXBElement }{@code <}{@link In }{@code >}
     * {@link JAXBElement }{@code <}{@link OrNot }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getCOPOrLOP() {
        if (copOrLOP == null) {
            copOrLOP = new ArrayList<JAXBElement<?>>();
        }
        return this.copOrLOP;
    }

    /**
     * Gets the value of the syntax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyntax() {
        return syntax;
    }

    /**
     * Sets the value of the syntax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyntax(String value) {
        this.syntax = value;
    }

}
