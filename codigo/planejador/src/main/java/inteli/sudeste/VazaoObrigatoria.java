//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.02.22 at 08:27:36 PM UTC
//


package inteli.sudeste;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{}capacidadeVazao"/&gt;
 *         &lt;element ref="{}dataInicioVigencia"/&gt;
 *         &lt;element ref="{}habilitarRestricao"/&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}idSubRedeTransporte"/&gt;
 *         &lt;element ref="{}indicadorUnidadeTempoVazao"/&gt;
 *         &lt;element ref="{}tipoVisaoPrazo"/&gt;
 *         &lt;element ref="{}unidadeQuantidade"/&gt;
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
    "capacidadeVazao",
    "dataInicioVigencia",
    "habilitarRestricao",
    "id",
    "idSubRedeTransporte",
    "indicadorUnidadeTempoVazao",
    "tipoVisaoPrazo",
    "unidadeQuantidade"
})
@XmlRootElement(name = "vazaoObrigatoria")
public class VazaoObrigatoria {

    @XmlElement(required = true)
    protected BigDecimal capacidadeVazao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicioVigencia;
    protected boolean habilitarRestricao;
    @XmlElement(required = true)
    protected Id id;
    @XmlElement(required = true)
    protected BigInteger idSubRedeTransporte;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String indicadorUnidadeTempoVazao;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tipoVisaoPrazo;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String unidadeQuantidade;

    /**
     * Gets the value of the capacidadeVazao property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCapacidadeVazao() {
        return capacidadeVazao;
    }

    /**
     * Sets the value of the capacidadeVazao property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCapacidadeVazao(BigDecimal value) {
        this.capacidadeVazao = value;
    }

    /**
     * Gets the value of the dataInicioVigencia property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    /**
     * Sets the value of the dataInicioVigencia property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDataInicioVigencia(XMLGregorianCalendar value) {
        this.dataInicioVigencia = value;
    }

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
     * Gets the value of the idSubRedeTransporte property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIdSubRedeTransporte() {
        return idSubRedeTransporte;
    }

    /**
     * Sets the value of the idSubRedeTransporte property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIdSubRedeTransporte(BigInteger value) {
        this.idSubRedeTransporte = value;
    }

    /**
     * Gets the value of the indicadorUnidadeTempoVazao property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIndicadorUnidadeTempoVazao() {
        return indicadorUnidadeTempoVazao;
    }

    /**
     * Sets the value of the indicadorUnidadeTempoVazao property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIndicadorUnidadeTempoVazao(String value) {
        this.indicadorUnidadeTempoVazao = value;
    }

    /**
     * Gets the value of the tipoVisaoPrazo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoVisaoPrazo() {
        return tipoVisaoPrazo;
    }

    /**
     * Sets the value of the tipoVisaoPrazo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoVisaoPrazo(String value) {
        this.tipoVisaoPrazo = value;
    }

    /**
     * Gets the value of the unidadeQuantidade property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnidadeQuantidade() {
        return unidadeQuantidade;
    }

    /**
     * Sets the value of the unidadeQuantidade property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnidadeQuantidade(String value) {
        this.unidadeQuantidade = value;
    }

}
