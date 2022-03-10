package u.mapping1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestSession {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setName("jai");
		e1.setEmail("vjai@gmail.com");

		Employee1 address1 = new Employee1();
		address1.setAddressLine1("G-21,kk nagar");
		address1.setCity("bangalore");
		address1.setState("tamilnadu");
		address1.setCountry("India");
		address1.setPincode(600077);

		e1.setAddress(address1);
		address1.setEmployee(e1);

		session.persist(e1);
		t.commit();

		session.close();
		System.out.println("success");
	}
}