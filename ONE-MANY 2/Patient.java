package y.map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient1")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pt_id;
	private String p_name;
	private String p_affectedby;

	public int getPt_id() {
		return pt_id;
	}

	public void setPt_id(int pt_id) {
		this.pt_id = pt_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_affectedby() {
		return p_affectedby;
	}

	public void setP_affectedby(String p_affectedby) {
		this.p_affectedby = p_affectedby;
	}

}
