package com.yaazli.springtraining.di.AppContext.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SetterAppContext-Collections.xml");
		    	CollectionInterface collectioninterface1 = (CollectionsBean) context.getBean("cb");
		    	String res = collectioninterface1.sayHello();
		    	System.out.println(res);
		    	
		    	CollectionInterface collectioninterface2 = (CollectionsBean) context.getBean("inheritanceBean");
		    	String res1 = collectioninterface2.sayHello();
		    	System.out.println(res1);
		    	
	}
}
