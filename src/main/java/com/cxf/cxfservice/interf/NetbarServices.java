package com.cxf.cxfservice.interf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://service.netbar.cn")
public interface NetbarServices {
	
	 @WebMethod
	String sayHello(@WebParam(name = "userName") String name);

}
