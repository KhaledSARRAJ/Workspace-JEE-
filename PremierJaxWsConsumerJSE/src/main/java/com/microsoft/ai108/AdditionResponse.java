
package com.microsoft.ai108;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour additionResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="additionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionResult" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionResponse", propOrder = {
    "additionResult"
})
public class AdditionResponse {

    @XmlElement(namespace = "http://ai108.microsoft.com")
    protected int additionResult;

    /**
     * Obtient la valeur de la propri�t� additionResult.
     * 
     */
    public int getAdditionResult() {
        return additionResult;
    }

    /**
     * D�finit la valeur de la propri�t� additionResult.
     * 
     */
    public void setAdditionResult(int value) {
        this.additionResult = value;
    }

}
