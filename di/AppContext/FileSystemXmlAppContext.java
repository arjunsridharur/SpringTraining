package com.yaazli.springtraining.di.AppContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlAppContext {
	ApplicationContext context = new FileSystemXmlApplicationContext("D:\\03 Java Projects Eclipse\\SpringTraining\\src\\main\\resources\\setter_application-context.xml");
	DIFSACEmployee DIFSAC = (DIFSACEmployee) context.getBean("DIFSAC");
	
	
	
	
}
