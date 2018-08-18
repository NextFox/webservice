
package com.cxf.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cxf.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Test1_QNAME = new QName("http://WebServiceTest.ztesoft.cutter.cn", "test1");
    private final static QName _Test3Response_QNAME = new QName("http://WebServiceTest.ztesoft.cutter.cn", "test3Response");
    private final static QName _Test2Response_QNAME = new QName("http://WebServiceTest.ztesoft.cutter.cn", "test2Response");
    private final static QName _Test1Response_QNAME = new QName("http://WebServiceTest.ztesoft.cutter.cn", "test1Response");
    private final static QName _Test3_QNAME = new QName("http://WebServiceTest.ztesoft.cutter.cn", "test3");
    private final static QName _Test2_QNAME = new QName("http://WebServiceTest.ztesoft.cutter.cn", "test2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cxf.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Test2 }
     * 
     */
    public Test2 createTest2() {
        return new Test2();
    }

    /**
     * Create an instance of {@link Test1Response }
     * 
     */
    public Test1Response createTest1Response() {
        return new Test1Response();
    }

    /**
     * Create an instance of {@link Test3 }
     * 
     */
    public Test3 createTest3() {
        return new Test3();
    }

    /**
     * Create an instance of {@link Test2Response }
     * 
     */
    public Test2Response createTest2Response() {
        return new Test2Response();
    }

    /**
     * Create an instance of {@link Test1 }
     * 
     */
    public Test1 createTest1() {
        return new Test1();
    }

    /**
     * Create an instance of {@link Test3Response }
     * 
     */
    public Test3Response createTest3Response() {
        return new Test3Response();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link ResultBean }
     * 
     */
    public ResultBean createResultBean() {
        return new ResultBean();
    }

    /**
     * Create an instance of {@link UserBean }
     * 
     */
    public UserBean createUserBean() {
        return new UserBean();
    }

    /**
     * Create an instance of {@link AcctBean }
     * 
     */
    public AcctBean createAcctBean() {
        return new AcctBean();
    }

    /**
     * Create an instance of {@link CustBean }
     * 
     */
    public CustBean createCustBean() {
        return new CustBean();
    }

    /**
     * Create an instance of {@link CreateUserReq }
     * 
     */
    public CreateUserReq createCreateUserReq() {
        return new CreateUserReq();
    }

    /**
     * Create an instance of {@link OrderBeanArray }
     * 
     */
    public OrderBeanArray createOrderBeanArray() {
        return new OrderBeanArray();
    }

    /**
     * Create an instance of {@link WebServiceObj }
     * 
     */
    public WebServiceObj createWebServiceObj() {
        return new WebServiceObj();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceTest.ztesoft.cutter.cn", name = "test1")
    public JAXBElement<Test1> createTest1(Test1 value) {
        return new JAXBElement<Test1>(_Test1_QNAME, Test1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceTest.ztesoft.cutter.cn", name = "test3Response")
    public JAXBElement<Test3Response> createTest3Response(Test3Response value) {
        return new JAXBElement<Test3Response>(_Test3Response_QNAME, Test3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceTest.ztesoft.cutter.cn", name = "test2Response")
    public JAXBElement<Test2Response> createTest2Response(Test2Response value) {
        return new JAXBElement<Test2Response>(_Test2Response_QNAME, Test2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceTest.ztesoft.cutter.cn", name = "test1Response")
    public JAXBElement<Test1Response> createTest1Response(Test1Response value) {
        return new JAXBElement<Test1Response>(_Test1Response_QNAME, Test1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceTest.ztesoft.cutter.cn", name = "test3")
    public JAXBElement<Test3> createTest3(Test3 value) {
        return new JAXBElement<Test3>(_Test3_QNAME, Test3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceTest.ztesoft.cutter.cn", name = "test2")
    public JAXBElement<Test2> createTest2(Test2 value) {
        return new JAXBElement<Test2>(_Test2_QNAME, Test2 .class, null, value);
    }

}
