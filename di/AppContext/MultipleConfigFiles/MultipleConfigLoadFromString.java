package com.yaazli.springtraining.di.AppContext.MultipleConfigFiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yaazli.springtraining.di.AppContext.Singleton.BeanScopeSingleton;

public class MultipleConfigLoadFromString {
	public static void main(String[] args) {
		ApplicationContext context = new   ClassPathXmlApplicationContext( new String[] {  "beanscope.xml", "SetterAppContext-Collections.xml"})  ;
		BeanScopeSingleton bss = (BeanScopeSingleton)context.getBean("beanscopesingleton");
		bss.getEmployeeDetails();
	}
}
