package com.cxf.client.testclient;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.cxf.client.AcctBean;
import com.cxf.client.CreateUserReq;
import com.cxf.client.CustBean;
import com.cxf.client.Item;
import com.cxf.client.OrderBeanArray;
import com.cxf.client.ResultBean;
import com.cxf.client.UserBean;
import com.cxf.client.WebServiceObj;
import com.cxf.client.WebServiceTest;

public class WsTestClient {

	
	//httpClient4.x.x
	
	@Test
	public void testHttpTest2() throws ClientProtocolException, IOException {
		
		URL url = new URL("http://192.168.31.155:8089/services/webServiceTest?wsdl");
		QName qname = new QName("http://192.168.31.155:8089/services","webServiceTest");
		Service service = Service.create(url,qname);
		
		WebServiceTest port = service.getPort(WebServiceTest.class);
		String test1 = port.test1();
		System.out.println(test1);
		
	}


	@Test
	public void testTest1() {
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		
		Client client  = dcf.createClient("http://192.168.31.155:8089/services/webServiceTest?wsdl");
		Object[] objects = new Object[0];
		
		try {
			objects = client.invoke("test1");
			
			System.out.println("return:  "+objects[0].toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//objects=client.invoke("", params)
	}
	
	@Test
	public void testTest2() throws InterruptedException {
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setAddress("http://192.168.31.155:8089/services/webServiceTest?wsdl");
		jaxWsProxyFactoryBean.setServiceClass(WebServiceTest.class);
		WebServiceTest wstest = (WebServiceTest)jaxWsProxyFactoryBean.create();
		WebServiceObj ob = new WebServiceObj();
		ob.setParam1("kafaka");
		ob.setParam2("ss");
	    WebServiceObj obj = wstest.test2(ob);
		System.out.println(obj);
		
	}
	
	@Test
	public void testTest3() {
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setAddress("http://192.168.31.155:8089/services/webServiceTest?wsdl");
		jaxWsProxyFactoryBean.setServiceClass(WebServiceTest.class);
		WebServiceTest wstest3 = (WebServiceTest) jaxWsProxyFactoryBean.create();
		CreateUserReq cur = new CreateUserReq();
		AcctBean acctBean = new AcctBean();
		CustBean custBean = new CustBean();
		OrderBeanArray orderBeanArray = new OrderBeanArray();
	    cur.setSequenceID("asfdasdf");
		UserBean userBean = new UserBean();
		
		
		//acc
		acctBean.setAcctID("dkfmd");
		acctBean.setBalance("asdfasdf");
		acctBean.setGatherFlag("asdfas");
		acctBean.setPaidUserID("asfasd");
		cur.setAcctBean(acctBean);
		//cust
		
		custBean.setCustID("adsfasd");
		custBean.setCustName("adfadf");
		custBean.setCustOccupType("adfasdf");
		custBean.setCustTelephone("adsfasdf");
		cur.setCustBean(custBean);
		
		//user
		userBean.setBandwidth("asfasdf");
		cur.setUserBean(userBean);
		//orderBeanArray
		List<Item> items = orderBeanArray.getItem();
		Item item = new Item();
		item.setContinueFlag("asdfas");
		items.add(item);
		cur.setOrderBeanArray(orderBeanArray);
		
		ResultBean response3 =wstest3.test3(cur);
			System.out.println(response3);
	}
	
	
	@Test
	public void testService() {
		
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client = dcf.createClient("http://localhost:1120/services/static?wsdl");
		// 需要密码的情况需要加上用户名和密码
	        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME,
	        // PASS_WORD));
		 Object[] objects = new Object[0];
		 
         try {
        	// invoke("方法名",参数1,参数2,参数3....);
			objects = client.invoke("sayHello", "gjy");
			
			System.out.println("return "+objects[0]);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	 // 1.代理类工厂的方式,需要拿到对方的接口地址
	/*
		public static void main1() {
			try {
				// 接口地址
				String address = "http://127.0.0.1:8080/soap/user?wsdl";
				// 代理工厂
				JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
				// 设置代理地址
				jaxWsProxyFactoryBean.setAddress(address);
				// 设置接口类型
				jaxWsProxyFactoryBean.setServiceClass(UserService.class);
				// 创建一个代理接口实现
				UserService us = (UserService) jaxWsProxyFactoryBean.create();
				// 数据准备
				String userId = "maple";
				// 调用代理接口的方法调用并返回结果
				String result = us.getUserName(userId);
				System.out.println("返回结果:" + result);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	 */
	
	//动态调用
	/*
	public static void main2() {
		// 创建动态客户端
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client = dcf.createClient("http://127.0.0.1:8080/soap/user?wsdl");
		// 需要密码的情况需要加上用户名和密码
		// client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
		Object[] objects = new Object[0];
		try {
			// invoke("方法名",参数1,参数2,参数3....);
			objects = client.invoke("getUserName", "maple");
			System.out.println(objects);
			System.out.println("返回数据:" + objects[0]);
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}
	*/

}
