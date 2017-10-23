package com.mapping.Oneto1.bidirectional;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@OneToOne(mappedBy="departmentdd", cascade=CascadeType.ALL)
	private Employee employee;
	
	public Department(){}
	
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
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
