//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.11 at 02:48:30 PM MST 
//


package semanticMarkup.io.input.lib.taxonx;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for div complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="div">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="head" type="{http://www.taxonx.org/schema/v1}head" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="p" type="{http://www.taxonx.org/schema/v1}p"/>
 *           &lt;element name="div" type="{http://www.taxonx.org/schema/v1}div"/>
 *           &lt;element name="pb" type="{http://www.taxonx.org/schema/v1}pb"/>
 *           &lt;element name="figure" type="{http://www.taxonx.org/schema/v1}figure"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.taxonx.org/schema/v1}standardAttrs"/>
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="abstract"/>
 *             &lt;enumeration value="acknowledgments"/>
 *             &lt;enumeration value="biology_ecology"/>
 *             &lt;enumeration value="description"/>
 *             &lt;enumeration value="diagnosis"/>
 *             &lt;enumeration value="discussion"/>
 *             &lt;enumeration value="distribution"/>
 *             &lt;enumeration value="etymology"/>
 *             &lt;enumeration value="key"/>
 *             &lt;enumeration value="introduction"/>
 *             &lt;enumeration value="materials_examined"/>
 *             &lt;enumeration value="materials_methods"/>
 *             &lt;enumeration value="multiple"/>
 *             &lt;enumeration value="synopsis"/>
 *             &lt;enumeration value=""/>
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
@XmlType(name = "div", namespace = "http://www.taxonx.org/schema/v1", propOrder = {
    "head",
    "pOrDivOrPb"
})
public class Div {

    protected Head head;
    @XmlElements({
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "div", type = Div.class),
        @XmlElement(name = "pb", type = Pb.class),
        @XmlElement(name = "figure", type = Figure.class)
    })
    protected List<Object> pOrDivOrPb;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "n")
    protected String n;

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link Head }
     *     
     */
    public Head getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link Head }
     *     
     */
    public void setHead(Head value) {
        this.head = value;
    }

    /**
     * Gets the value of the pOrDivOrPb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pOrDivOrPb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOrDivOrPb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * {@link Div }
     * {@link Pb }
     * {@link Figure }
     * 
     * 
     */
    public List<Object> getPOrDivOrPb() {
        if (pOrDivOrPb == null) {
            pOrDivOrPb = new ArrayList<Object>();
        }
        return this.pOrDivOrPb;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN(String value) {
        this.n = value;
    }

}
