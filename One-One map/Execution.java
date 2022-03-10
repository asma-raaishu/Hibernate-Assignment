package a.onemap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Execution {
	public static void main(String args[]) {
		Configuration c = new Configuration();
		c = c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		System.out.println("Session is ready" + s);
		Transaction t = s.beginTransaction();

		Person1 p1 = new Person1();
		p1.setName("Alya");
		p1.setAddress("Mumbai");

		Passport p = new Passport();
		p.setPassport_no(1001);
		p.setValid_year("2022");
		p1.setPassport_id(p);
		p.setPerson(p1);

		s.persist(p1);
		t.commit();
		s.close();
		System.out.println("Datas are created....");

	}

}
