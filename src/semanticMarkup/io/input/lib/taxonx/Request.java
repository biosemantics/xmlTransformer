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
 *         &lt;element name="header" type="{http://digir.net/schema/protocol/2003/1.0}header"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="search" type="{http://digir.net/schema/protocol/2003/1.0}searchOperation"/>
 *           &lt;element name="inventory" type="{http://digir.net/schema/protocol/2003/1.0}inventoryOperation"/>
 *         &lt;/choice>
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
    "header",
    "search",
    "inventory"
})
@XmlRootElement(name = "request", namespace = "http://digir.net/schema/protocol/2003/1.0")
public class Request {

    @XmlElement(namespace = "http://digir.net/schema/protocol/2003/1.0", required = true)
    protected Header header;
    @XmlElement(namespace = "http://digir.net/schema/protocol/2003/1.0")
    protected SearchOperation search;
    @XmlElement(namespace = "http://digir.net/schema/protocol/2003/1.0")
    protected InventoryOperation inventory;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the search property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOperation }
     *     
     */
    public SearchOperation getSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOperation }
     *     
     */
    public void setSearch(SearchOperation value) {
        this.search = value;
    }

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryOperation }
     *     
     */
    public InventoryOperation getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryOperation }
     *     
     */
    public void setInventory(InventoryOperation value) {
        this.inventory = value;
    }

}
