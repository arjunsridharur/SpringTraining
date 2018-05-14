package com.yaazli.springtraining.di.AppContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CPXAppContext {
		public static void main(String[] args) {
			ApplicationContext context = new   ClassPathXmlApplicationContext("setter_application-context.xml");
			DICPACEmployee DICPAC = (DICPACEmployee) context.getBean("DICPAC");
			DICPAC.getEmployeeDetails();
		}
}