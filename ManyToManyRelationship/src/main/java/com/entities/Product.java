package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Product_Table_")
public class Product { // MANY

	@Id
	int pId;
	String pName;
	String cateogry;
	
	@ManyToMany
	@JoinTable(name = "Product_Customer",
	            joinColumns=@JoinColumn(name="product_id"),
	            inverseJoinColumns = @JoinColumn(name="customer_id"))
	List<Customer> cl;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getCateogry() {
		return cateogry;
	}

	public void setCateogry(String cateogry) {
		this.cateogry = cateogry;
	}

	public List<Customer> getCl() {
		return cl;
	}

	public void setCl(List<Customer> cl) {
		this.cl = cl;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", cateogry=" + cateogry + ", cl=" + cl + "]";
	}

	public Product(int pId, String pName, String cateogry, List<Customer> cl) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.cateogry = cateogry;
		this.cl = cl;
	}

	public Product() {
		
		
	}
	
	
}
