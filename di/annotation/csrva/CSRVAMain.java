package com.yaazli.springtraining.di.annotation.csrva;
//CSRVA @Component @Service @Resource @Qualifier
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CSRVAMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext actx = new AnnotationConfigApplicationContext();
		actx.scan("com.yaazli");
		//actx.register(ComponentClassBean.class);
		actx.refresh();
		
		
	//	ResturantCCB rccb=(ResturantCCB) actx.getBean("rccb");
	//	actx
		}
}
