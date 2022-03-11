package m.many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "ques1")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "vino")
	// In this case the the generation table is created by hibernate with name
	// hibernate_sequences and
	// there will be two column sequence_name and sequence_next_hi_value
	// but we can change the above by my own settings like the following
	@TableGenerator(name = "vino", table = "G123", pkColumnName = "gkey", valueColumnName = "gnext", pkColumnValue = "course", allocationSize = 30)

	private int qid;
	private String qname;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "qid")
	private List<Answer> answers;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}
