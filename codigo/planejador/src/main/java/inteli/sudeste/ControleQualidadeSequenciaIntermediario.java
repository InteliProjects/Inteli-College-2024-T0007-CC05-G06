//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.22 at 08:27:36 PM UTC 
//


package inteli.sudeste;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}produtos"/&gt;
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
    "produtos"
})
@XmlRootElement(name = "controleQualidadeSequenciaIntermediario")
public class ControleQualidadeSequenciaIntermediario {

    @XmlElement(required = true)
    protected Produtos produtos;

    /**
     * Gets the value of the produtos property.
     * 
     * @return
     *     possible object is
     *     {@link Produtos }
     *     
     */
    public Produtos getProdutos() {
        return produtos;
    }

    /**
     * Sets the value of the produtos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Produtos }
     *     
     */
    public void setProdutos(Produtos value) {
        this.produtos = value;
    }

}
