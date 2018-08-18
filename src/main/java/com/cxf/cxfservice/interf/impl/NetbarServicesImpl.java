package com.cxf.cxfservice.interf.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.cxf.cxfservice.interf.NetbarServices;



@WebService(serviceName = "NetbarServices"//服务名
,targetNamespace = "http://service.netbar.cn"//和接口定义保持一致
,endpointInterface = "com.cxf.cxfservice.interf.NetbarServices")//包名
@Component
public class NetbarServicesImpl implements NetbarServices {

	@Override
	public String sayHello(String name) {
		return name+"you are ok";
	}

}
