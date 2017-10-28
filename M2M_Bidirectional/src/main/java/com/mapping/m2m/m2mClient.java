package com.mapping.m2m;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class m2mClient {
	
	
	public static void main(String[] args){
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();

		Groups groupAdmin = new Groups();
		groupAdmin.setName("Administrator");
		
		Groups groupGuest = new Groups();
		groupGuest.setName("Guest");
		
		Users user1 = new Users();
		user1.setEmail("sajid@xavient.com");
		user1.setPassword("sajid");
		user1.setUserName("sajid");
		
		Users user2 = new Users();
		user2.setEmail("abid@xaient.com");
		user2.setPassword("Abid");
		user2.setUserName("Abid");
		
		groupAdmin.getUserList().add(user1);
		groupAdmin.getUserList().add(user2);
		
		groupGuest.getUserList().add(user1);
		groupGuest.getUserList().add(user2);
		
		System.out.println("-----------saving object---------------");
		session.save(groupAdmin);
		session.save(groupGuest);
		System.out.println("-----------object Saved---------------");
		session.getTransaction().commit();
		
		session.close();
	}

}
