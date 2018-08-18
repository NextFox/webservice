
package com.cxf.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "webServiceTest", targetNamespace = "http://WebServiceTest.ztesoft.cutter.cn", wsdlLocation = "http://192.168.31.155:8089/services/webServiceTest?wsdl")
public class WebServiceTest_Service
    extends Service
{

    private final static URL WEBSERVICETEST_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICETEST_EXCEPTION;
    private final static QName WEBSERVICETEST_QNAME = new QName("http://WebServiceTest.ztesoft.cutter.cn", "webServiceTest");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.31.155:8089/services/webServiceTest?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICETEST_WSDL_LOCATION = url;
        WEBSERVICETEST_EXCEPTION = e;
    }

    public WebServiceTest_Service() {
        super(__getWsdlLocation(), WEBSERVICETEST_QNAME);
    }

    public WebServiceTest_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICETEST_QNAME, features);
    }

    public WebServiceTest_Service(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICETEST_QNAME);
    }

    public WebServiceTest_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICETEST_QNAME, features);
    }

    public WebServiceTest_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceTest_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServiceTest
     */
    @WebEndpoint(name = "WebServiceTestPort")
    public WebServiceTest getWebServiceTestPort() {
        return super.getPort(new QName("http://WebServiceTest.ztesoft.cutter.cn", "WebServiceTestPort"), WebServiceTest.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceTest
     */
    @WebEndpoint(name = "WebServiceTestPort")
    public WebServiceTest getWebServiceTestPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebServiceTest.ztesoft.cutter.cn", "WebServiceTestPort"), WebServiceTest.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICETEST_EXCEPTION!= null) {
            throw WEBSERVICETEST_EXCEPTION;
        }
        return WEBSERVICETEST_WSDL_LOCATION;
    }

}
