
package hr.algebra.iisproject.models;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pica" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="proizvodjac" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="cijena" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="valuta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pica"
})
@XmlRootElement(name = "alkoholnaPica")
public class AlkoholnaPica {

    protected List<AlkoholnaPica.Pica> pica;

    /**
     * Gets the value of the pica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlkoholnaPica.Pica }
     * 
     * 
     */
    public List<AlkoholnaPica.Pica> getPica() {
        if (pica == null) {
            pica = new ArrayList<AlkoholnaPica.Pica>();
        }
        return this.pica;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="proizvodjac" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="cijena" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="valuta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "proizvodjac",
        "naziv",
        "cijena",
        "valuta"
    })
    public static class Pica {

        @XmlElement(required = true)
        protected String proizvodjac;
        @XmlElement(required = true)
        protected String naziv;
        @XmlElement(required = true)
        protected BigInteger cijena;
        @XmlElement(required = true)
        protected String valuta;
        @XmlAttribute(name = "id")
        protected BigInteger id;

        /**
         * Gets the value of the proizvodjac property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProizvodjac() {
            return proizvodjac;
        }

        /**
         * Sets the value of the proizvodjac property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProizvodjac(String value) {
            this.proizvodjac = value;
        }

        /**
         * Gets the value of the naziv property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNaziv() {
            return naziv;
        }

        /**
         * Sets the value of the naziv property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNaziv(String value) {
            this.naziv = value;
        }

        /**
         * Gets the value of the cijena property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCijena() {
            return cijena;
        }

        /**
         * Sets the value of the cijena property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCijena(BigInteger value) {
            this.cijena = value;
        }

        /**
         * Gets the value of the valuta property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValuta() {
            return valuta;
        }

        /**
         * Sets the value of the valuta property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValuta(String value) {
            this.valuta = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setId(BigInteger value) {
            this.id = value;
        }

    }

}
