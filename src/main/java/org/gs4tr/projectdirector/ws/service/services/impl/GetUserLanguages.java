
package org.gs4tr.projectdirector.ws.service.services.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userTicket"
})
@XmlRootElement(name = "getUserLanguages")
public class GetUserLanguages {

    @XmlElement(required = true)
    protected String userTicket;

    /**
     * Gets the value of the userTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTicket() {
        return userTicket;
    }

    /**
     * Sets the value of the userTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTicket(String value) {
        this.userTicket = value;
    }

}
