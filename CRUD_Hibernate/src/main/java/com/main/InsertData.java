package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;


public class InsertData {

	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t= ss.beginTransaction();
		
		Employee e = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter department");
		e.setDep(sc.nextLine());
		
		System.out.println("Enter Id");
		e.setEmpId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Name");
		e.setEmpName(sc.nextLine());
	
		System.out.println("Enter Salary");
		e.setSalary(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter Experience");
		e.setExp(sc.nextFloat());
		
		ss.persist(e);
		t.commit();
		ss.close();
		
	}
}
