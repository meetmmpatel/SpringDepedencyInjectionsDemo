package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	private Employee employee;
	private Department department;

	// Constructor based Dependency
	@Autowired
	public Company(Employee employee) {
		super();
		this.employee = employee;
	}

	public void showEmployeeInfo() {
		employee.showEmployeeInfo();
	}

	//Example of Setter based dependency
	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}

	public void showDepartmentInfo() {
		department.showDepartmentInfo();
	}

}
