package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int CustId;
	String name;
	int age;
	String address;
	@OneToOne
	Tractor tac;
	
	public int getCustId() {
		return CustId;
	}
	public void setCustId(int custId) {
		CustId = custId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Tractor getTac() {
		return tac;
	}
	public void setTac(Tractor tac) {
		this.tac = tac;
	}
	public Customer(int custId, String name, int age, String address, Tractor tac) {
		super();
		CustId = custId;
		this.name = name;
		this.age = age;
		this.address = address;
		this.tac = tac;
	}
	public Customer() {
		
	}
	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", name=" + name + ", age=" + age + ", address=" + address + ", tac="
				+ tac + "]";
	}
	
	
	
	
	
}
