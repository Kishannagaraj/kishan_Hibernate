package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.User;

public class SampleMain {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("com/cfg/hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		User user = session.get(User.class , 10);
		System.out.println("User");
		
	}

}
