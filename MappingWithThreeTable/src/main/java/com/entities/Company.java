package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Company_Table")
public class Company {

	@Id
	int Cid;
	String CompanyName;
	
	
	
	public Company(int cid, String companyName) {
		super();
		Cid = cid;
		CompanyName = companyName;
	}
	public Company() {
		
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	@Override
	public String toString() {
		return "Company [Cid=" + Cid + ", CompanyName=" + CompanyName + "]";
	}
	
	
}
