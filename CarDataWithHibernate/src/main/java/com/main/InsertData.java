package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.CarInfo;

public class InsertData {

	public static void main(String args[]) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(CarInfo.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();

		CarInfo c1 = new CarInfo(6, "Suzuki", "Grand Vitara", "CNG", 13.00559, 2024);

		ss.persist(c1);

		ts.commit();
		ss.close();

		System.out.println("Data Is Insterted....!");
	}
}
