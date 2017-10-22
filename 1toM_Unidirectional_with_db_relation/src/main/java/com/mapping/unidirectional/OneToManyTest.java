package com.mapping.unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyTest {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		/*Department d = new Department();
		d.setName("CSG7");
		d.setLocation("USA7");
		
		Employee e1 = new Employee();
		e1.setAddress("Noida..7");
		e1.setAge(20);
		e1.setName("AAAAAAAAAAA--7");
		e1.setSalary(2000);
		//e1.setDepartment(d);
		//e1.setDepartmentId(1);
		
		Employee e2 = new Employee();
		e2.setAddress("Delhi..7");
		e2.setAge(40);
		e2.setName("BBBBBBBB---7");
		e2.setSalary(3000);
		//e2.setDepartment(d);
		//e2.setDepartmentId(1);
		
		d.getEmployeeList().add(e1);
		d.getEmployeeList().add(e2);
		
		Transaction tx = session.beginTransaction();
		System.out.println("savinng");
		session.save(d);
		System.out.println("savinng done ");	
		tx.commit();*/
		
		Department dd = (Department)session.get(Department.class, new Integer(16));
		
		System.out.println(dd.getEmployeeList().size());
	}

}
