//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.11 at 02:48:30 PM MST 
//


package semanticMarkup.io.input.lib.taxonx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;


/**
 * A search operation, specifying query conditions and result details.
 * 
 * <p>Java class for searchOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://digir.net/schema/protocol/2003/1.0}filter"/>
 *         &lt;element name="records" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="structure">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;any processContents='lax'/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="schemaLocation" type="{http://digir.net/schema/protocol/2003/1.0}urlType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
 *                 &lt;attribute name="limit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="10" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchOperation", namespace = "http://digir.net/schema/protocol/2003/1.0", propOrder = {
    "filter",
    "records",
    "count"
})
public class SearchOperation {

    @XmlElement(required = true)
    protected Filter filter;
    protected SearchOperation.Records records;
    @XmlElement(defaultValue = "false")
    protected boolean count;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link Filter }
     *     
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filter }
     *     
     */
    public void setFilter(Filter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOperation.Records }
     *     
     */
    public SearchOperation.Records getRecords() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOperation.Records }
     *     
     */
    public void setRecords(SearchOperation.Records value) {
        this.records = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public boolean isCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(boolean value) {
        this.count = value;
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
     *       &lt;sequence>
     *         &lt;element name="structure">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;any processContents='lax'/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="schemaLocation" type="{http://digir.net/schema/protocol/2003/1.0}urlType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
     *       &lt;attribute name="limit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="10" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "structure"
    })
    public static class Records {

        @XmlElement(namespace = "http://digir.net/schema/protocol/2003/1.0", required = true)
        protected SearchOperation.Records.Structure structure;
        @XmlAttribute(name = "start")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger start;
        @XmlAttribute(name = "limit")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger limit;

        /**
         * Gets the value of the structure property.
         * 
         * @return
         *     possible object is
         *     {@link SearchOperation.Records.Structure }
         *     
         */
        public SearchOperation.Records.Structure getStructure() {
            return structure;
        }

        /**
         * Sets the value of the structure property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchOperation.Records.Structure }
         *     
         */
        public void setStructure(SearchOperation.Records.Structure value) {
            this.structure = value;
        }

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStart() {
            if (start == null) {
                return new BigInteger("0");
            } else {
                return start;
            }
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStart(BigInteger value) {
            this.start = value;
        }

        /**
         * Gets the value of the limit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLimit() {
            if (limit == null) {
                return new BigInteger("10");
            } else {
                return limit;
            }
        }

        /**
         * Sets the value of the limit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLimit(BigInteger value) {
            this.limit = value;
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
         *       &lt;sequence minOccurs="0">
         *         &lt;any processContents='lax'/>
         *       &lt;/sequence>
         *       &lt;attribute name="schemaLocation" type="{http://digir.net/schema/protocol/2003/1.0}urlType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class Structure {

            @XmlMixed
            @XmlAnyElement(lax = true)
            protected List<Object> content;
            @XmlAttribute(name = "schemaLocation")
            protected String schemaLocation;

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * {@link Object }
             * {@link Element }
             * 
             * 
             */
            public List<Object> getContent() {
                if (content == null) {
                    content = new ArrayList<Object>();
                }
                return this.content;
            }

            /**
             * Gets the value of the schemaLocation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchemaLocation() {
                return schemaLocation;
            }

            /**
             * Sets the value of the schemaLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchemaLocation(String value) {
                this.schemaLocation = value;
            }

        }

    }

}
