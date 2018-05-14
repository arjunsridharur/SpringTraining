package com.yaazli.springtraining.di.AppContext;

public class DISetterEmployee {

	public int empId;
	public String empName;

	// Setter Methods

	public void getEmployeeDetails() {
		System.out.println(empId);
		System.out.println(empName);
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
