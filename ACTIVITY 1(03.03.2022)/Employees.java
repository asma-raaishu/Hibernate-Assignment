package h.demopro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeedata")

class Employees 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_id")
	private int emp_id;
	@Column(name="emp_name")
	private String emp_name;
	@Column(name="email_id")
	private String email_id;
	@Column(name="salary")
	private int salary;
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(int emp_id, String emp_name, String email_id, int salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.email_id = email_id;
		this.salary = salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [emp_id=" + emp_id + ", emp_name=" + emp_name + ", email_id=" + email_id + ", salary="
				+ salary + "]";
	}
	
	

}
