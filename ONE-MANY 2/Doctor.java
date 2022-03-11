package y.map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "doctor1")

public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int d_id;
	private String d_stream;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "d_id")
	private List<Patient> Patient;

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getD_stream() {
		return d_stream;
	}

	public void setD_stream(String d_stream) {
		this.d_stream = d_stream;
	}

	public List<Patient> getPatient() {
		return Patient;
	}

	public void setPatient(List<Patient> patient) {
		this.Patient = patient;
	}

}
