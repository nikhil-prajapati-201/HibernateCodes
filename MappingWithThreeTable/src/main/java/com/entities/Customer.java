package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_Table")
public class Customer { // MANY

	@Id
	int cut_Id;
	String name;
	int age;
	String city;
	
	@ManyToOne
	@JoinColumn(name="Product")
	Products pdc;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cut_Id, String name, int age, String city, Products pdc) {
		super();
		this.cut_Id = cut_Id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.pdc = pdc;
	}

	public int getCut_Id() {
		return cut_Id;
	}

	public void setCut_Id(int cut_Id) {
		this.cut_Id = cut_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Products getPdc() {
		return pdc;
	}

	public void setPdc(Products pdc) {
		this.pdc = pdc;
	}

	@Override
	public String toString() {
		return "Customer [cut_Id=" + cut_Id + ", name=" + name + ", age=" + age + ", city=" + city + ", pdc=" + pdc
				+ "]";
	}
	
	
	
}
