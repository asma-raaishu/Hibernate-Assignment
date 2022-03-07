package h.demopro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateEmployees 
{
	public static void main(String args[])
	{
		Configuration c=new Configuration();
		c=c.configure();
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		System.out.println("Session is ready"+s);
		Transaction t=s.beginTransaction();
		Employees emp=new Employees();
		emp.setEmp_id(007);
		emp.setEmp_name("ziya");
		emp.setEmail_id("ziy405@gamil.com");
		emp.setSalary(26000);
		s.save(emp);
		t.commit();
		System.out.println("data is created...");
		s.close();
		
	}

}
