package y.map;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Prescription {

	public static void main(String[] args) {

		System.out.println("one to many.....");
		Configuration con = new Configuration();
		con = con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();

		Transaction tr = s.beginTransaction();
		Patient pt = new Patient();
		pt.setP_name("monika");
		pt.setP_affectedby("mental disorder");

		Patient pt1 = new Patient();
		pt1.setP_name("maansi");
		pt1.setP_affectedby("infectious disease");

		Patient pt2 = new Patient();
		pt2.setP_name("Arnav");
		pt2.setP_affectedby("viral fever");

		ArrayList<Patient> i = new ArrayList<>();
		i.add(pt);
		i.add(pt1);
		i.add(pt2);

		Doctor d = new Doctor();
		d.setD_stream("pediatrician");
		d.setPatient(i);
		s.save(d);
		tr.commit();
		s.close();
		System.out.println("the data are created successfully.......");
	}

}
