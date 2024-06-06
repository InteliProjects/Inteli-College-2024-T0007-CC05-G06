//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.02.22 at 08:27:36 PM UTC
//


package inteli.sudeste;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}habilitarRestricao"/&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}qtdeDisponivel"/&gt;
 *         &lt;element ref="{}unidadeMedidaTempo"/&gt;
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
    "habilitarRestricao",
    "id",
    "qtdeDisponivel",
    "unidadeMedidaTempo"
})
@XmlRootElement(name = "disponibilidadeTransporte")
public class DisponibilidadeTransporte {

    protected boolean habilitarRestricao;
    @XmlElement(required = true)
    protected Id id;
    @XmlElement(required = true)
    protected BigDecimal qtdeDisponivel;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String unidadeMedidaTempo;

    /**
     * Gets the value of the habilitarRestricao property.
     *
     */
    public boolean isHabilitarRestricao() {
        return habilitarRestricao;
    }

    /**
     * Sets the value of the habilitarRestricao property.
     *
     */
    public void setHabilitarRestricao(boolean value) {
        this.habilitarRestricao = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link Id }
     *
     */
    public Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link Id }
     *
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the qtdeDisponivel property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getQtdeDisponivel() {
        return qtdeDisponivel;
    }

    /**
     * Sets the value of the qtdeDisponivel property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setQtdeDisponivel(BigDecimal value) {
        this.qtdeDisponivel = value;
    }

    /**
     * Gets the value of the unidadeMedidaTempo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnidadeMedidaTempo() {
        return unidadeMedidaTempo;
    }

    /**
     * Sets the value of the unidadeMedidaTempo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnidadeMedidaTempo(String value) {
        this.unidadeMedidaTempo = value;
    }

}
