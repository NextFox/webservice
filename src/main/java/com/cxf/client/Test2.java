
package com.cxf.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>test2 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="test2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://WebServiceTest.ztesoft.cutter.cn}webServiceObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "test2", propOrder = {
    "arg0"
})
public class Test2 {

    protected WebServiceObj arg0;

    /**
     * ��ȡarg0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WebServiceObj }
     *     
     */
    public WebServiceObj getArg0() {
        return arg0;
    }

    /**
     * ����arg0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceObj }
     *     
     */
    public void setArg0(WebServiceObj value) {
        this.arg0 = value;
    }

}
