
package com.inflectra.remotelaunch.services.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="AutomationEngine_RetrieveResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects}ArrayOfRemoteAutomationEngine" minOccurs="0"/>
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
    "automationEngineRetrieveResult"
})
@XmlRootElement(name = "AutomationEngine_RetrieveResponse")
public class AutomationEngineRetrieveResponse {

    @XmlElementRef(name = "AutomationEngine_RetrieveResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v4.0/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRemoteAutomationEngine> automationEngineRetrieveResult;

    /**
     * Gets the value of the automationEngineRetrieveResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteAutomationEngine }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteAutomationEngine> getAutomationEngineRetrieveResult() {
        return automationEngineRetrieveResult;
    }

    /**
     * Sets the value of the automationEngineRetrieveResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteAutomationEngine }{@code >}
     *     
     */
    public void setAutomationEngineRetrieveResult(JAXBElement<ArrayOfRemoteAutomationEngine> value) {
        this.automationEngineRetrieveResult = ((JAXBElement<ArrayOfRemoteAutomationEngine> ) value);
    }

}
