package m.many;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("------ONE TO MANY-----");
		Configuration cf = new Configuration();
		cf = cf.configure("hibernate.cfg.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

		Answer ans1 = new Answer();
		ans1.setAnswername("Java is programming language");
		ans1.setPerson("vinodha");

		Answer ans2 = new Answer();
		ans2.setAnswername("Java is not highly secure Language");
		ans2.setPerson("priya");

		Answer ans3 = new Answer();
		ans3.setAnswername("Java is object oriented programming language");
		ans3.setPerson("indu");

		ArrayList<Answer> x = new ArrayList<>();
		x.add(ans1);
		x.add(ans2);
		x.add(ans3);

		Question q1 = new Question();
		q1.setQname("What is java");
		q1.setAnswers(x);

		s.save(q1);
		t.commit();
		s.close();
		System.out.println("save successfully");

	}
}
