package oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.entityClass.Department;
import com.mapping.entityClass.Employee;

public class OneToManyTest {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Department d = new Department();
		d.setName("CSG");
		d.setLocation("USA");
		
		Employee e1 = new Employee();
		e1.setAddress("Noida..");
		e1.setAge(20);
		e1.setName("AAAAAAAAAAA");
		e1.setSalary(2000);
		e1.setDepartment(d);
		//e1.setDepartmentId(1);
		
		Employee e2 = new Employee();
		e2.setAddress("Delhi..");
		e2.setAge(40);
		e2.setName("BBBBBBBB");
		e2.setSalary(3000);
		e2.setDepartment(d);
		//e2.setDepartmentId(1);
		
		d.getEmployeeList().add(e1);
		d.getEmployeeList().add(e2);
		
		Transaction tx = session.beginTransaction();
		System.out.println("savinng");
		session.save(d);
		//session.save(e1);
		//session.save(e2);
		System.out.println("savinng done ");	
		tx.commit();
		/*Department dd = (Department)session.get(Department.class, new Integer(1));
		
		System.out.println(dd.getEmployeeList().size());*/
		
		
		
		
	}

}
