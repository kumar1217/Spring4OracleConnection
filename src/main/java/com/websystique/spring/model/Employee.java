package com.websystique.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE", schema="KUMAR")
public class Employee {

	@Id
	@Column(name = "EMP_ID")
	private String empId;

	@Column(name = "EMP_NAME")
	private String empName;

	@Column(name = "EMP_SALARY")
	private int empSalary;

	@Column(name = "DESIGINATION")
	private String desigination;

	public Employee() {
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getDesigination() {
		return desigination;
	}

	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}

}
