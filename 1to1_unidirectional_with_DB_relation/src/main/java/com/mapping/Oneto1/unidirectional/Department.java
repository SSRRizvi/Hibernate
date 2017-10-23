package com.mapping.Oneto1.unidirectional;

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
@Table(name="department")
public class Department implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="deptId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="deptName")
	private String name;
	@Column(name="deptLocation")
	private String location;
	
	/*@OneToOne(targetEntity=Employee.class ,cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="empDeptId")
	private Employee employee = new Employee();*/
	
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	/*public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}*/
	
}
