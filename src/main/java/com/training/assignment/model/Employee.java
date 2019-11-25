package com.training.assignment.model;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private Integer employeeId;
	private String employeeName;
	private Double salary;
	
	public Employee() {
	}
	
	public Employee(Integer employeeId, String employeeName, Double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	

	
}
