package com.main;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Company;
import com.entities.Customer;
import com.entities.Products;

public class MainClass {

	public static void main(String args[]) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(Products.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		Company c  = new Company();
		c.setCid(171);
		c.setCompanyName("Apple");
		
		
		Products p = new Products();
		p.setProductName("Ipad");
		p.setProductPrice(87000);
		p.setCmp(c);
		
		Customer c1 = new Customer();
		c1.setAge(22);
		c1.setCity("Ahemdabad");
		c1.setCut_Id(121);
		c1.setName("Chaitanya");
		c1.setPdc(p);
		
		Customer c2 = new Customer();
		c2.setAge(26);
		c2.setCity("Delhi");
		c2.setCut_Id(122);
		c2.setName("Pooja");
		c2.setPdc(p);
		
		Customer c3 = new Customer();
		c3.setAge(28);
		c3.setCity("Banglore");
		c3.setCut_Id(123);
		c3.setName("Kiran");
		c3.setPdc(p);
		
		Customer c4 = new Customer();
		c3.setAge(22);
		c3.setCity("Hyderabbad");
		c3.setCut_Id(125);
		c3.setName("Dilip");
		c3.setPdc(p);
		
		List<Customer> li = Arrays.asList(c1,c2,c3,c4);
		ss.persist(c);
		ss.persist(p);
		ss.persist(c1);
		ss.persist(c2);
		ss.persist(c3);
		ss.persist(c4);
		
		
		p.setCust(li);
		
		ts.commit();
		ss.close();
		
		System.out.println("Data Inserted Succesfully");
	}
}
