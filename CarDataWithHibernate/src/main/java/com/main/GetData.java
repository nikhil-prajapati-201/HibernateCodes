package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.CarInfo;

public class GetData {

	public static void main(String args[]) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(CarInfo.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();

		CarInfo c = ss.get(CarInfo.class, 1);

		System.out.println(c);

		ts.commit();
		ss.close();
	}
}
