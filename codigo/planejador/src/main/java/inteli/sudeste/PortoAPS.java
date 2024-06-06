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
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}tipoElo"/&gt;
 *         &lt;element ref="{}ativo"/&gt;
 *         &lt;element ref="{}batches"/&gt;
 *         &lt;element ref="{}blendagem"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{}capacidadeMaximaEstocagem"/&gt;
 *           &lt;element ref="{}capacidadeMinimaEstocagem"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{}centroDistribuicao"/&gt;
 *         &lt;element ref="{}china"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{}codigoInternacional"/&gt;
 *           &lt;element ref="{}codigoPais"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{}codigoPorto"/&gt;
 *         &lt;element ref="{}descricao"/&gt;
 *         &lt;element ref="{}habilitarRestricao"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{}horaFimDPC"/&gt;
 *           &lt;element ref="{}horaInicioDPC"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{}idClienteProprietario"/&gt;
 *         &lt;element ref="{}idGrupoPorto" minOccurs="0"/&gt;
 *         &lt;element ref="{}qtdeRebocadorDisponivel" minOccurs="0"/&gt;
 *         &lt;element ref="{}siteProdutivoAPS"/&gt;
 *         &lt;element ref="{}tempoAntecedenciaChegada" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{}tamanhoSobra"/&gt;
 *             &lt;element ref="{}tamanhoSubLote"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{}tempoIntervaloAtracacao"/&gt;
 *             &lt;element ref="{}tempoIntervaloCarregamentoDesatracacao"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}tempoPadraoOperacao"/&gt;
 *         &lt;element ref="{}ultimaSequencia" minOccurs="0"/&gt;
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
    "id",
    "tipoElo",
    "ativo",
    "batches",
    "blendagem",
    "capacidadeMaximaEstocagem",
    "capacidadeMinimaEstocagem",
    "centroDistribuicao",
    "china",
    "codigoInternacional",
    "codigoPais",
    "codigoPorto",
    "descricao",
    "habilitarRestricao",
    "horaFimDPC",
    "horaInicioDPC",
    "idClienteProprietario",
    "idGrupoPorto",
    "qtdeRebocadorDisponivel",
    "siteProdutivoAPS",
    "tempoAntecedenciaChegada",
    "tamanhoSobra",
    "tamanhoSubLote",
    "tempoIntervaloAtracacao",
    "tempoIntervaloCarregamentoDesatracacao",
    "tempoPadraoOperacao",
    "ultimaSequencia"
})
@XmlRootElement(name = "portoAPS")
public class PortoAPS {

    @XmlElement(required = true)
    protected Id id;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tipoElo;
    protected boolean ativo;
    protected boolean batches;
    protected boolean blendagem;
    protected String capacidadeMaximaEstocagem;
    protected String capacidadeMinimaEstocagem;
    protected boolean centroDistribuicao;
    protected boolean china;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoInternacional;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoPais;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoPorto;
    @XmlElement(required = true)
    protected String descricao;
    protected boolean habilitarRestricao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horaFimDPC;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horaInicioDPC;
    @XmlElement(required = true)
    protected BigInteger idClienteProprietario;
    protected BigInteger idGrupoPorto;
    protected BigInteger qtdeRebocadorDisponivel;
    @XmlElement(required = true)
    protected SiteProdutivoAPS siteProdutivoAPS;
    protected BigDecimal tempoAntecedenciaChegada;
    protected BigDecimal tamanhoSobra;
    protected BigDecimal tamanhoSubLote;
    protected BigInteger tempoIntervaloAtracacao;
    protected BigInteger tempoIntervaloCarregamentoDesatracacao;
    @XmlElement(required = true)
    protected BigDecimal tempoPadraoOperacao;
    protected BigInteger ultimaSequencia;

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
     * Gets the value of the tipoElo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoElo() {
        return tipoElo;
    }

    /**
     * Sets the value of the tipoElo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoElo(String value) {
        this.tipoElo = value;
    }

    /**
     * Gets the value of the ativo property.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Sets the value of the ativo property.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
    }

    /**
     * Gets the value of the batches property.
     * 
     */
    public boolean isBatches() {
        return batches;
    }

    /**
     * Sets the value of the batches property.
     * 
     */
    public void setBatches(boolean value) {
        this.batches = value;
    }

    /**
     * Gets the value of the blendagem property.
     * 
     */
    public boolean isBlendagem() {
        return blendagem;
    }

    /**
     * Sets the value of the blendagem property.
     * 
     */
    public void setBlendagem(boolean value) {
        this.blendagem = value;
    }

    /**
     * Gets the value of the capacidadeMaximaEstocagem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public String getCapacidadeMaximaEstocagem() {
        return capacidadeMaximaEstocagem;
    }

    /**
     * Sets the value of the capacidadeMaximaEstocagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapacidadeMaximaEstocagem(String value) {
        this.capacidadeMaximaEstocagem = value;
    }

    /**
     * Gets the value of the capacidadeMinimaEstocagem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public String getCapacidadeMinimaEstocagem() {
        return capacidadeMinimaEstocagem;
    }

    /**
     * Sets the value of the capacidadeMinimaEstocagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapacidadeMinimaEstocagem(String value) {
        this.capacidadeMinimaEstocagem = value;
    }

    /**
     * Gets the value of the centroDistribuicao property.
     * 
     */
    public boolean isCentroDistribuicao() {
        return centroDistribuicao;
    }

    /**
     * Sets the value of the centroDistribuicao property.
     * 
     */
    public void setCentroDistribuicao(boolean value) {
        this.centroDistribuicao = value;
    }

    /**
     * Gets the value of the china property.
     * 
     */
    public boolean isChina() {
        return china;
    }

    /**
     * Sets the value of the china property.
     * 
     */
    public void setChina(boolean value) {
        this.china = value;
    }

    /**
     * Gets the value of the codigoInternacional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoInternacional() {
        return codigoInternacional;
    }

    /**
     * Sets the value of the codigoInternacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoInternacional(String value) {
        this.codigoInternacional = value;
    }

    /**
     * Gets the value of the codigoPais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Sets the value of the codigoPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
    }

    /**
     * Gets the value of the codigoPorto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPorto() {
        return codigoPorto;
    }

    /**
     * Sets the value of the codigoPorto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPorto(String value) {
        this.codigoPorto = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
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
     * Gets the value of the horaFimDPC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraFimDPC() {
        return horaFimDPC;
    }

    /**
     * Sets the value of the horaFimDPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraFimDPC(XMLGregorianCalendar value) {
        this.horaFimDPC = value;
    }

    /**
     * Gets the value of the horaInicioDPC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraInicioDPC() {
        return horaInicioDPC;
    }

    /**
     * Sets the value of the horaInicioDPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraInicioDPC(XMLGregorianCalendar value) {
        this.horaInicioDPC = value;
    }

    /**
     * Gets the value of the idClienteProprietario property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdClienteProprietario() {
        return idClienteProprietario;
    }

    /**
     * Sets the value of the idClienteProprietario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdClienteProprietario(BigInteger value) {
        this.idClienteProprietario = value;
    }

    /**
     * Gets the value of the idGrupoPorto property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdGrupoPorto() {
        return idGrupoPorto;
    }

    /**
     * Sets the value of the idGrupoPorto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdGrupoPorto(BigInteger value) {
        this.idGrupoPorto = value;
    }

    /**
     * Gets the value of the qtdeRebocadorDisponivel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdeRebocadorDisponivel() {
        return qtdeRebocadorDisponivel;
    }

    /**
     * Sets the value of the qtdeRebocadorDisponivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdeRebocadorDisponivel(BigInteger value) {
        this.qtdeRebocadorDisponivel = value;
    }

    /**
     * Gets the value of the siteProdutivoAPS property.
     * 
     * @return
     *     possible object is
     *     {@link SiteProdutivoAPS }
     *     
     */
    public SiteProdutivoAPS getSiteProdutivoAPS() {
        return siteProdutivoAPS;
    }

    /**
     * Sets the value of the siteProdutivoAPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteProdutivoAPS }
     *     
     */
    public void setSiteProdutivoAPS(SiteProdutivoAPS value) {
        this.siteProdutivoAPS = value;
    }

    /**
     * Gets the value of the tempoAntecedenciaChegada property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTempoAntecedenciaChegada() {
        return tempoAntecedenciaChegada;
    }

    /**
     * Sets the value of the tempoAntecedenciaChegada property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTempoAntecedenciaChegada(BigDecimal value) {
        this.tempoAntecedenciaChegada = value;
    }

    /**
     * Gets the value of the tamanhoSobra property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTamanhoSobra() {
        return tamanhoSobra;
    }

    /**
     * Sets the value of the tamanhoSobra property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTamanhoSobra(BigDecimal value) {
        this.tamanhoSobra = value;
    }

    /**
     * Gets the value of the tamanhoSubLote property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTamanhoSubLote() {
        return tamanhoSubLote;
    }

    /**
     * Sets the value of the tamanhoSubLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTamanhoSubLote(BigDecimal value) {
        this.tamanhoSubLote = value;
    }

    /**
     * Gets the value of the tempoIntervaloAtracacao property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTempoIntervaloAtracacao() {
        return tempoIntervaloAtracacao;
    }

    /**
     * Sets the value of the tempoIntervaloAtracacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTempoIntervaloAtracacao(BigInteger value) {
        this.tempoIntervaloAtracacao = value;
    }

    /**
     * Gets the value of the tempoIntervaloCarregamentoDesatracacao property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTempoIntervaloCarregamentoDesatracacao() {
        return tempoIntervaloCarregamentoDesatracacao;
    }

    /**
     * Sets the value of the tempoIntervaloCarregamentoDesatracacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTempoIntervaloCarregamentoDesatracacao(BigInteger value) {
        this.tempoIntervaloCarregamentoDesatracacao = value;
    }

    /**
     * Gets the value of the tempoPadraoOperacao property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTempoPadraoOperacao() {
        return tempoPadraoOperacao;
    }

    /**
     * Sets the value of the tempoPadraoOperacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTempoPadraoOperacao(BigDecimal value) {
        this.tempoPadraoOperacao = value;
    }

    /**
     * Gets the value of the ultimaSequencia property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUltimaSequencia() {
        return ultimaSequencia;
    }

    /**
     * Sets the value of the ultimaSequencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUltimaSequencia(BigInteger value) {
        this.ultimaSequencia = value;
    }

}
