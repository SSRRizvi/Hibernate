package com.mapping.Oneto1.bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyTest {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Department d = new Department();
		d.setName("CSG3");
		d.setLocation("USA3");
		
		Employee e1 = new Employee();
		e1.setAddress("Noida..3");
		e1.setAge(20);
		e1.setName("AAAAAAAAAAA--3");
		e1.setSalary(2000);
		e1.setDepartmentdd(d);
		//d.setEmployee(e1);
		
		
		Transaction tx = session.beginTransaction();
		System.out.println("savinng");
		session.save(e1);
		System.out.println("savinng done ");	
		tx.commit();
		
		/*Department dd = (Department)session.get(Department.class, new Integer(30));
		
		System.out.println(dd.getEmployee());*/
		
		/*Employee dd = (Employee)session.get(Employee.class, new Integer(29));
		
		System.out.println(dd.getDepartmentdd());*/
		
		
	}

}
