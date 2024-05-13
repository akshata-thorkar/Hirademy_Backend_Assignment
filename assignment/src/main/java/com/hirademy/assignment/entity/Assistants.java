package com.hirademy.assignment.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "assistants")
public class Assistants {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String mobile;
	private String email;
	private double salary;
	private String city;
	private String country;
	private String department;
	private String role;
	
	public Assistants() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Assistants(Long id, String name, String mobile, String email, double salary, String city, String country,
			String department, String role) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.salary = salary;
		this.city = city;
		this.country = country;
		this.department = department;
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "Assistants [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", salary="
				+ salary + ", city=" + city + ", country=" + country + ", department=" + department + ", role=" + role
				+ "]";
	}
	
}
