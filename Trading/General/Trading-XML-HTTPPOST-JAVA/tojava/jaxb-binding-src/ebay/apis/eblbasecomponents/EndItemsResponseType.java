//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains a response of the resulting status of ending each item.				
 * 			
 * 
 * <p>Java class for EndItemsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndItemsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="EndItemResponseContainer" type="{urn:ebay:apis:eBLBaseComponents}EndItemResponseContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndItemsResponseType", propOrder = {
    "endItemResponseContainer"
})
public class EndItemsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "EndItemResponseContainer")
    protected List<EndItemResponseContainerType> endItemResponseContainer;

    /**
     * Gets the value of the endItemResponseContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endItemResponseContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndItemResponseContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndItemResponseContainerType }
     * 
     * 
     */
    public List<EndItemResponseContainerType> getEndItemResponseContainer() {
        if (endItemResponseContainer == null) {
            endItemResponseContainer = new ArrayList<EndItemResponseContainerType>();
        }
        return this.endItemResponseContainer;
    }

}
