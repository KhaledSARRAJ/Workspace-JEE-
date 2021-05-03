
package com.catstat.ai108;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getNbCatResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getNbCatResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nbCat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNbCatResponse", propOrder = {
    "nbCat"
})
public class GetNbCatResponse {

    protected Long nbCat;

    /**
     * Obtient la valeur de la propriété nbCat.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNbCat() {
        return nbCat;
    }

    /**
     * Définit la valeur de la propriété nbCat.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNbCat(Long value) {
        this.nbCat = value;
    }

}
