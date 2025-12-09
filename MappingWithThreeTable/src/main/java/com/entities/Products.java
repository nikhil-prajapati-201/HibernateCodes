package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ProductsTable")
public class Products { // ONE

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pId;
	String ProductName;
	int productPrice;
	
	@OneToOne
	Company cmp;
	
	
	@OneToMany(mappedBy = "pdc")
	List<Customer> cust;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Products [pId=" + pId + ", ProductName=" + ProductName + ", productPrice=" + productPrice + ", cmp="
				+ cmp + ", cust=" + cust + "]";
	}



	public Company getCmp() {
		return cmp;
	}



	public void setCmp(Company cmp) {
		this.cmp = cmp;
	}



	public Products(int pId, String productName, int productPrice, Company cmp, List<Customer> cust) {
		super();
		this.pId = pId;
		ProductName = productName;
		this.productPrice = productPrice;
		this.cmp = cmp;
		this.cust = cust;
	}



	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public List<Customer> getCust() {
		return cust;
	}

	public void setCust(List<Customer> cust) {
		this.cust = cust;
	}

	
	
	
	
}
