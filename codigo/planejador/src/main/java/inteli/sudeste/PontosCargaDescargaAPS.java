//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.02.22 at 08:27:36 PM UTC
//


package inteli.sudeste;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}pontoCargaDescargaAPS" maxOccurs="unbounded"/&gt;
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
    "pontoCargaDescargaAPS"
})
@XmlRootElement(name = "pontosCargaDescargaAPS")
public class PontosCargaDescargaAPS {

    @XmlElement(required = true)
    protected List<PontoCargaDescargaAPS> pontoCargaDescargaAPS;

    /**
     * Gets the value of the pontoCargaDescargaAPS property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pontoCargaDescargaAPS property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPontoCargaDescargaAPS().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PontoCargaDescargaAPS }
     *
     *
     */
    public List<PontoCargaDescargaAPS> getPontoCargaDescargaAPS() {
        if (pontoCargaDescargaAPS == null) {
            pontoCargaDescargaAPS = new ArrayList<PontoCargaDescargaAPS>();
        }
        return this.pontoCargaDescargaAPS;
    }

}
