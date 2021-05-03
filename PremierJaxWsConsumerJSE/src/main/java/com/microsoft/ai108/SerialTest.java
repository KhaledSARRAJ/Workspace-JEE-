
package com.microsoft.ai108;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour serialTest complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="serialTest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputPerson" type="{http://ai108.microsoft.com}personne" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serialTest", propOrder = {
    "inputPerson"
})
public class SerialTest {

    protected Personne inputPerson;

    /**
     * Obtient la valeur de la propri�t� inputPerson.
     * 
     * @return
     *     possible object is
     *     {@link Personne }
     *     
     */
    public Personne getInputPerson() {
        return inputPerson;
    }

    /**
     * D�finit la valeur de la propri�t� inputPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link Personne }
     *     
     */
    public void setInputPerson(Personne value) {
        this.inputPerson = value;
    }

}
