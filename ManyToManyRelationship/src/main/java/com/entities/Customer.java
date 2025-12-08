package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_Table_")
public class Customer { // MANY

	@Id
	int custId;
	String name;
	String city;
	
	@ManyToMany(mappedBy = "cl")
	List<Product> products;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String name, String city, List<Product> products) {
		super();
		this.custId = custId;
		this.name = name;
		this.city = city;
		this.products = products;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setPl(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", city=" + city + ", pl=" + products + "]";
	}
	
	
}
