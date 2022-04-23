package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	private String jobTitle;
	private double salary;
	
	
	public Employee(int id, String username, String password, String jobTitle, double salary) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	public Employee(String username, String password, String jobTitle, double salary) {
		this.username = username;
		this.password = password;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	
	public Employee(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id, jobTitle, password, salary, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(jobTitle, other.jobTitle) && Objects.equals(password, other.password)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", jobTitle=" + jobTitle
				+ ", salary=" + salary + "]";
	}
	
	
	
}
