
package com.catstat.ai108;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getNbUserResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getNbUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nbUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNbUserResponse", propOrder = {
    "nbUser"
})
public class GetNbUserResponse {

    protected Long nbUser;

    /**
     * Obtient la valeur de la propriété nbUser.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNbUser() {
        return nbUser;
    }

    /**
     * Définit la valeur de la propriété nbUser.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNbUser(Long value) {
        this.nbUser = value;
    }

}
