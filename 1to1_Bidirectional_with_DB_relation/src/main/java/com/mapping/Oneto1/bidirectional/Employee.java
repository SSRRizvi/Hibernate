package com.mapping.Oneto1.bidirectional;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="empId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id; 
	@Column(name="empName")
    private String name; 
	@Column(name="empAddress")
	private String address;
	@Column(name="empAge")
	private int age;
	@Column(name="empSalary")
	private double salary;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="empDeptId")
	private Department departmentdd;
	
	public Employee(){}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartmentdd() {
		return departmentdd;
	}
	public void setDepartmentdd(Department departmentdd) {
		this.departmentdd = departmentdd;
	}
	
}
