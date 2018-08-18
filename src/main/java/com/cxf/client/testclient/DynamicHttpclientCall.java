package com.cxf.client.testclient;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.http.client.fluent.Content;

//动态构造数据
//动态构造调用串，灵活性更大
public class DynamicHttpclientCall {

	private String namespace;
	private String methodName;
	private String wsdlLocation;
	private String soapresponseData;

	public DynamicHttpclientCall(String namespace, String methodName, String wsdlLocation) {
		super();
		this.namespace = namespace;
		this.methodName = methodName;
		this.wsdlLocation = wsdlLocation;
	}

	private int invoke(Map<String, String> parameterMap) throws Exception {
		PostMethod postMethod = new PostMethod(wsdlLocation);
		String soapRequestData = buildRequestData(parameterMap);

		byte[] bytes = soapRequestData.getBytes("utf-8");
		InputStream inputStream = new ByteArrayInputStream(bytes, 0, bytes.length);
		RequestEntity requestEntity = new InputStreamRequestEntity(inputStream, bytes.length,
				"application/soap+xml;charset=utf-8");
		postMethod.setRequestEntity(requestEntity);

		HttpClient httpClient = new HttpClient();
		int statusCode = httpClient.executeMethod(postMethod);
		soapresponseData = postMethod.getResponseBodyAsString();
		return statusCode;
	}
	
	private String buildRequestData(Map<String, String> parameterMap) {

		StringBuffer sb = new StringBuffer();
		sb.append(
				"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ser=\"http://service.netbar.cn\">");
		
		
		sb.append("<soapenv:Header/>");
		sb.append("<soapenv:Body>");
		
		sb.append("<ser:"+methodName+">");
		Set<String> nameSet = parameterMap.keySet();
		for (String name : nameSet) {
			sb.append("<" + name + ">" + parameterMap.get(name) + "</" + name + ">");
		}
		sb.append("</ser:"+methodName+">");
		
		sb.append("</soapenv:Body>");
		sb.append("</soapenv:Envelope>");
		
		

		return sb.toString();
	}

	public static void main(String[] args) throws Exception {
		DynamicHttpclientCall dynamicHttpclientCall = new DynamicHttpclientCall("http://service.netbar.cn", "sayHello",
				"http://localhost:1120/services/static?wsdl");

		
		Map<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("userName", "xxxxxxxxxc");
		String soapRequestData = dynamicHttpclientCall.buildRequestData(parameterMap);
		System.out.println(soapRequestData);

		
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		
		
		int statusCode = dynamicHttpclientCall.invoke(parameterMap);
		if (statusCode == 200) {
			System.out.println("调用成功！ ");
			String data = dynamicHttpclientCall.soapresponseData;
			System.out.println(data);
		} else {
			System.out.println("调用失败！失败码： " + statusCode);
		}
	}

	

}
