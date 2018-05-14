package com.yaazli.springtraining.di.AppContext.Singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SingletonAppMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanscope.xml");
		BeanScopeSingleton bss = (BeanScopeSingleton)context.getBean("beanscopesingleton");
		bss.getEmployeeDetails();
	}
}
