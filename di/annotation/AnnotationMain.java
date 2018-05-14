package com.yaazli.springtraining.di.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
	public static void main(String[] args) {  
	    ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");  
	    AnnoConstructorBean annoconstructorbean=context.getBean("annoconstructorbean", AnnoConstructorBean.class);  
	    annoconstructorbean.display();
	   // AnnoSetterBean annosetterbean=context.getBean("annosetterbean", AnnoSetterBean.class);  
	  //  annosetterbean.print();
	}
}