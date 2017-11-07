package com.mapping.OneToMany.withNoRelation;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class client {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Student s1 = new Student();
		s1.setStudenName("Wipe");
		s1.setStudentAge(23);
		
		Student s2 = new Student();
		s2.setStudenName("Accenture");
		s2.setStudentAge(23);
		
		Course c1 = new Course();
		c1.setName("Java");
		c1.setFee(40000);
		c1.getStudent().add(s1);
		c1.getStudent().add(s2);
		
		
		Transaction tx = session.beginTransaction();
		session.save(c1);
		tx.commit();
		session.flush();
		session.close();

	}

}
