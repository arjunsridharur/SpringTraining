package com.yaazli.springtraining.di.AppContext.AutoWiring;

public class ConstructorBean {
	SetterBean setterbean;


	ConstructorBean() {
		System.out.println("ConstructorBean is created");
	}

	public SetterBean getSetterbean() {
		return setterbean;
	}



	public void setSetterbean(SetterBean setterbean) {
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
