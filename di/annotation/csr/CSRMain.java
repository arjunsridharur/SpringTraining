package com.yaazli.springtraining.di.annotation.csr;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;


//@Component
//@ComponentScan

public class CSRMain {
	public static void main(String[] args) {
	AnnotationConfigApplicationContext annotationcontext = new AnnotationConfigApplicationContext();
	annotationcontext.scan("com.yaazli");
	//annotationcontext.register(ComponentClassBean.class);
	annotationcontext.refresh();
	
	
	ComponentClassBean componentclassbean=(ComponentClassBean) annotationcontext.getBean("componentclassbean");
	componentclassbean.ComponentBean();
	}
}
