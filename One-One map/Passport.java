package a.onemap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Passport1")

public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int p_no;
	private int passport_no;
	private String valid_year;
	@OneToOne(targetEntity = Person1.class)
	// @ManyToOne
	// @JoinColumn( name="p_no")
	private Person1 Person;

	public int getPassport_no() {
		return passport_no;
	}

	public void setPassport_no(int passport_no) {
		this.passport_no = passport_no;
	}

	public String getValid_year() {
		return valid_year;
	}

	public void setValid_year(String valid_year) {
		this.valid_year = valid_year;
	}

	public Person1 getPerson() {
		return Person;
	}

	public void setPerson(Person1 person) {
		this.Person = person;
	}

}
