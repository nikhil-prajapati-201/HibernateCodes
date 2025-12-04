package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Data")
public class Employee {

	@Id
	@Column(name="Id")
	int empId;
	
	@Column(name="Name")
	String empName;
	
	@Column(name="Department")
	String dep;
	
	@Column(name="Experience")
	float exp;
	
	@Column(name="Salary")
	double salary;
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public float getExp() {
		return exp;
	}
	public void setExp(float exp) {
		this.exp = exp;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	public Employee(int empId, String empName, String dep, float exp, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dep = dep;
		this.exp = exp;
		this.salary = salary;
	}
	
	
	public Employee() {
		
	}
	
	
	@Override
	public String toString() {
		return "Employee Deatils"
				+ "\nempId= " + empId + "\nempName= " + empName + "\ndep= " + dep + "\nexp= " + exp + "\nsalary= "
				+ salary;
	}
	
	
}
