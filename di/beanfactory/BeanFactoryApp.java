package com.yaazli.springtraining.di.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryApp {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("setter_application-context.xml"));

		DISetterEmployee DISE = (DISetterEmployee) factory.getBean("DISE");
		
		DISE.getEmployee();
	}
}
