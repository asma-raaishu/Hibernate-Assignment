package h.demopro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateEmployees
{

	public static void main(String[] args) 
	{
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employees.class).buildSessionFactory();
		Session s=sf.openSession();
		try
		{
			int Emp_id=3;
			s=sf.openSession();
			s.beginTransaction();
			System.out.println("Getting student id"+Emp_id);
			Employees readEmployees=s.get(Employees.class,Emp_id);
			System.out.println("update the Employees detail");
			readEmployees.setEmp_name("ram");
			s.getTransaction().commit();
			s=sf.openSession();
			s.beginTransaction();
			System.out.println("rows updated");
			s.getTransaction().commit();
			
		}
		finally
		{
			sf.close();
		}

	}

}
