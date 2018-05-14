package com.yaazli.springtraining.di.AppContext.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringMain {
	public static void main(String[] args) {  
	    ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");  
	    ConstructorBean constructorbean=context.getBean("constructorbean", ConstructorBean.class);  
	    constructorbean.display();
	    //SetterBean setterbean=context.getBean("setterbean", SetterBean.class);  
	    //setterbean.print();
	}  
}
