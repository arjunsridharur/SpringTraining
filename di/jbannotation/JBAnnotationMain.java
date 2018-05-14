package com.yaazli.springtraining.di.jbannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JBAnnotationMain {
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
	    Manager  obj = (Manager) context.getBean("Service");
	    System.out.println( obj.getServiceName());
	}
}
