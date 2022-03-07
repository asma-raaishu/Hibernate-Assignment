package h.demopro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteEmployees {

	public static void main(String[] args)
	{
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employees.class).buildSessionFactory();
		Session s=sf.openSession();
		try
		{
			int Emp_id=8;
			s=sf.openSession();
			s.beginTransaction();
			System.out.println("retriving the data");
			Employees readEmployees=s.get(Employees.class,Emp_id);
			System.out.println("delete the data..");
			
			s.delete(readEmployees);
			s.getTransaction().commit();
		}
		finally
		{
			sf.close();
		}


	}

}
