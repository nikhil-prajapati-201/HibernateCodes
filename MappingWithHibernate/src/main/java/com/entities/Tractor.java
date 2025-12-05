package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Tractor_Data")
public class Tractor {

	@Id
	int chehisNo;
	String brand;
	String model;
	
	public int getChehisNo() {
		return chehisNo;
	}
	public void setChehisNo(int chehisNo) {
		this.chehisNo = chehisNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Tractor(int chehisNo, String brand, String model) {
		super();
		this.chehisNo = chehisNo;
		this.brand = brand;
		this.model = model;
	}
	public Tractor() {
		
	}
	@Override
	public String toString() {
		return "Tractor [chehisNo=" + chehisNo + ", brand=" + brand + ", model=" + model + "]";
	}
	
	
}
