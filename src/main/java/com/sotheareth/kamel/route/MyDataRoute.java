package com.sotheareth.kamel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sotheareth.kamel.properties.ApplicationProperties;

@Component
public class MyDataRoute extends RouteBuilder {
	
	@Autowired
	private ApplicationProperties properties;

	@Override
	public void configure() throws Exception {
		
		System.out.println("from=" + properties.getFrom());
		System.out.println("to=" + properties.getTo());
		
		from(properties.getFrom())
		.to(properties.getTo());
	}

}
