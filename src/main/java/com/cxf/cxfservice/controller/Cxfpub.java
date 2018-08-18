package com.cxf.cxfservice.controller;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cxf.cxfservice.interf.NetbarServices;

@Configuration
public class Cxfpub {

	@Autowired
	private Bus bus;
	
	@Autowired
	private NetbarServices netbarServices;
	
	@Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus,netbarServices);
        endpoint.publish("/static");//接口发布在 /static 目录下,验证地址：http://localhost:1120/services/static?wsdl
        return endpoint;
    }
	

}
