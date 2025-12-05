package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Customer;
import com.entities.Tractor;

public class Main {

	public static void main (String args[]) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(Tractor.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction ts = ss.beginTransaction();
		
		Tractor t1 = new Tractor();
		t1.setChehisNo(1245321);
		t1.setBrand("Mahindra");
		t1.setModel("Sarpanch");
		
		ss.persist(t1);
		
		Customer c = new Customer();
//		c.setCustId(101);
		c.setName("Rahul Prajapati");
		c.setAge(24);
		c.setAddress("Surat");
		c.setTac(t1);
		
		ss.persist(c);
		ts.commit();
		ss.close();
		System.out.println("Data Added Succesfully");
		
	}
}
