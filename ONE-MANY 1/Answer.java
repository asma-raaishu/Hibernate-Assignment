package m.many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ans1")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String answername;
	private String person;

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswername() {
		return answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}

}
