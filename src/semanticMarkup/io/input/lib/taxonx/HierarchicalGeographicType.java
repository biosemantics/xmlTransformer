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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 *  752
 * 
 * <p>Java class for hierarchicalGeographicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hierarchicalGeographicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="continent" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="territory" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="island" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hierarchicalGeographicType", propOrder = {
    "continentOrCountryOrProvince"
})
public class HierarchicalGeographicType {

    @XmlElementRefs({
        @XmlElementRef(name = "county", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "city", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "region", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "country", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "continent", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "area", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "state", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "island", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "province", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "territory", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<Object>> continentOrCountryOrProvince;

    /**
     * Gets the value of the continentOrCountryOrProvince property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the continentOrCountryOrProvince property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContinentOrCountryOrProvince().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getContinentOrCountryOrProvince() {
        if (continentOrCountryOrProvince == null) {
            continentOrCountryOrProvince = new ArrayList<JAXBElement<Object>>();
        }
        return this.continentOrCountryOrProvince;
    }

}