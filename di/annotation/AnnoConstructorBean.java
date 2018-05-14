package com.yaazli.springtraining.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class AnnoConstructorBean {
	@Autowired(required=false)
	AnnoSetterBean setterbean;
	
	AnnoConstructorBean() {
		System.out.println("ConstructorBean is created");
	}

	public AnnoSetterBean getSetterbean() {
		return setterbean;
	}

	public void setSetterbean(AnnoSetterBean setterbean) {
		this.setterbean = setterbean;
	}

	void print() {
		System.out.println("Hi I'm ConstructorBean Pop's out");
	}

	void display() {
		print();
		setterbean.print();
	}
}
