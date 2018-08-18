
package com.cxf.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>createUserReq complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="createUserReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctBean" type="{http://WebServiceTest.ztesoft.cutter.cn}acctBean" minOccurs="0"/>
 *         &lt;element name="custBean" type="{http://WebServiceTest.ztesoft.cutter.cn}custBean" minOccurs="0"/>
 *         &lt;element name="orderBeanArray" type="{http://WebServiceTest.ztesoft.cutter.cn}orderBeanArray" minOccurs="0"/>
 *         &lt;element name="sequenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userBean" type="{http://WebServiceTest.ztesoft.cutter.cn}userBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUserReq", propOrder = {
    "acctBean",
    "custBean",
    "orderBeanArray",
    "sequenceID",
    "userBean"
})
public class CreateUserReq {

    protected AcctBean acctBean;
    protected CustBean custBean;
    protected OrderBeanArray orderBeanArray;
    protected String sequenceID;
    protected UserBean userBean;

    /**
     * 获取acctBean属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AcctBean }
     *     
     */
    public AcctBean getAcctBean() {
        return acctBean;
    }

    /**
     * 设置acctBean属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBean }
     *     
     */
    public void setAcctBean(AcctBean value) {
        this.acctBean = value;
    }

    /**
     * 获取custBean属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustBean }
     *     
     */
    public CustBean getCustBean() {
        return custBean;
    }

    /**
     * 设置custBean属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustBean }
     *     
     */
    public void setCustBean(CustBean value) {
        this.custBean = value;
    }

    /**
     * 获取orderBeanArray属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderBeanArray }
     *     
     */
    public OrderBeanArray getOrderBeanArray() {
        return orderBeanArray;
    }

    /**
     * 设置orderBeanArray属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderBeanArray }
     *     
     */
    public void setOrderBeanArray(OrderBeanArray value) {
        this.orderBeanArray = value;
    }

    /**
     * 获取sequenceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceID() {
        return sequenceID;
    }

    /**
     * 设置sequenceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceID(String value) {
        this.sequenceID = value;
    }

    /**
     * 获取userBean属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UserBean }
     *     
     */
    public UserBean getUserBean() {
        return userBean;
    }

    /**
     * 设置userBean属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UserBean }
     *     
     */
    public void setUserBean(UserBean value) {
        this.userBean = value;
    }

}
