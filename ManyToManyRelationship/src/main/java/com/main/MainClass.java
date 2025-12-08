package com.main;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Customer;
import com.entities.Product;



public class MainClass {
	
	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(Product.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		 Product p1 = new Product();
	     Product p2 = new Product();
	     Product p3 = new Product();
	     Product p4 = new Product();
	     Product p5 = new Product();
	     Product p6 = new Product();
	     
	     p1.setCateogry("Electronic");
	     p1.setpId(101);
	     p1.setpName("Mobile");
	     
	     p2.setCateogry("Grocerry");
	     p2.setpId(102);
	     p2.setpName("Oil");
	     
	     p3.setCateogry("Vegiies");
	     p3.setpId(103);
	     p3.setpName("Green Chilis");
	     
	     p4.setCateogry("Electronic");
	     p4.setpId(104);
	     p4.setpName("Laptop");
	     
	     p5.setCateogry("Cosmatic");
	     p5.setpId(105);
	     p5.setpName("Face Wash");
	     
	     p6.setCateogry("Cosmatic");
	     p6.setpId(106);
	     p6.setpName("Body lotion");
	        // -----------------------------------------
	        // 2. Creating Customers and Assigning Products
	        // -----------------------------------------
	        Customer c1 = new Customer(01, "Nikhil", "Mumbai", Arrays.asList(p1, p2));
	        Customer c2 = new Customer(02, "Rahul", "Delhi",  Arrays.asList(p3, p4));
	        Customer c3 = new Customer(03, "Hitesh", "Banglore", Arrays.asList(p5, p6));
	        Customer c4 = new Customer(04, "Dipak", "Hyderabaad",  Arrays.asList(p1, p3));
	        Customer c5 = new Customer(05, "Chaitnya", "Bhuvneshwar", Arrays.asList(p2, p6));
	        Customer c6 = new Customer(06, "Pooja", "Jalgaon",  Arrays.asList(p4, p6));

	     ss.persist(p1);   
	     ss.persist(p2);   
	     ss.persist(p3);   
	     ss.persist(p4);   
	     ss.persist(p5);   
	     ss.persist(p6); 
	     
	     p1.setCl(Arrays.asList(c1,c3));
	     p2.setCl(Arrays.asList(c6,c3));
	     p3.setCl(Arrays.asList(c5,c1));
	     p4.setCl(Arrays.asList(c2,c4));
	     p5.setCl(Arrays.asList(c3,c5));
	     
	     ss.persist(c1);
	     ss.persist(c2);
	     ss.persist(c3);
	     ss.persist(c4);
	     ss.persist(c5);
	     ss.persist(c6);
	     
		ts.commit();
		ss.close();
		
		System.out.println("Added Data");
	}

}
