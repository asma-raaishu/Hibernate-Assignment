package h.demopro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadEmployees
{

	public static void main(String[] args) 
	{
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employees.class).buildSessionFactory();
		Session s=sf.openSession();
		try
		{
			System.out.println("Creating new Employees data...");
			Employees emp=new Employees(001,"rahul","rahul@gamil.com",25000);
			s.beginTransaction();
			s.save(emp);
			System.out.println("read in database");
			s.getTransaction().commit();
			System.out.println("getting the employee id"+emp.getEmp_id());
			s=sf.openSession();
			s.beginTransaction();
			System.out.println("Show employees data");
			s.getTransaction().commit();
			
		}
		finally
		{
			sf.close();
		}
		

	}

}
