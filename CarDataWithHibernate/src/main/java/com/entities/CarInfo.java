package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Car Information")
public class CarInfo {

	@Id
	@Column(name = "Car_Id")
	int id;
	String brand;
	String model;
	@Column(name = "Fule")
	String fule_type;
	double price;
	@Column(name = "Launch_Year")
	int year;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFule_type() {
		return fule_type;
	}

	public void setFule_type(String fule_type) {
		this.fule_type = fule_type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public CarInfo(int id, String brand, String model, String fule_type, double price, int year) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.fule_type = fule_type;
		this.price = price;
		this.year = year;
	}

	public CarInfo() {

	}

	@Override
	public String toString() {
		return "CarInfo id= " + id + ", brand= " + brand + ", model= " + model + ", fule_type= " + fule_type
				+ ", price= " + price + ", year= " + year;
	}
}
