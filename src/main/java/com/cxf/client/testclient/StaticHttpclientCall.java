package com.cxf.client.testclient;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;


//构造静态数据
public class StaticHttpclientCall {

	public static void main(String[] args) throws HttpException, IOException {

		String name = "sddd";

		StaticHttpclientCall clientTest = new StaticHttpclientCall();

		String soapReqData = clientTest.getXml(name);
		System.out.println(soapReqData);
		
		PostMethod postMethod = new PostMethod("http://localhost:1120/services/static?wsdl");
		
		//然后把soap请求数据添加到PostMethod中
		byte[] b=soapReqData.getBytes("utf-8");
		InputStream is = new ByteArrayInputStream(b,0,b.length);
		RequestEntity re = new InputStreamRequestEntity(is,b.length,"application/soap+xml;charset=utf-8");
		postMethod.setRequestEntity(re);
		
		//最后生成一个HttpClient对象，并发出postMethod请求
		HttpClient httpClient = new HttpClient();
		int statusCode = httpClient.executeMethod(postMethod);
		
		if(statusCode==200) {
			System.out.println("调用成功");
			String soapResponseData = postMethod.getResponseBodyAsString();
			
			System.out.println(soapResponseData);
		}else {
			System.out.println("调用失败！错误码 ： "+statusCode);
		}
		
		
	}

	public   String getXml(String name) {
		
		StringBuffer sb = new StringBuffer();
		    sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ser=\"http://service.netbar.cn\">");
		    sb.append("   <soapenv:Header/>              ");
		    sb.append("   <soapenv:Body>                 ");
		    sb.append("      <ser:sayHello>              ");
		    sb.append("         <!--Optional:-->         ");
		    sb.append("         <userName>"+name+"</userName> ");
		    sb.append("      </ser:sayHello>             ");
		    sb.append("   </soapenv:Body>                ");
		    sb.append("</soapenv:Envelope>               ");  
		
		return sb.toString();
	}
}
