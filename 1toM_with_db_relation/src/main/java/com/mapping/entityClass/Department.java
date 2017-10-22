package com.mapping.entityClass;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {

	@Id
	@Column(name="deptId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="deptName")
	private String name;
	@Column(name="deptLocation")
	private String location;
	
	@OneToMany(mappedBy="department" , cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	//@JoinColumn(name="empDeptId", referencedColumnName="deptId")
	private Set<Employee> employeeList = new HashSet<Employee>();
	
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
	public Set<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(Set<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
}
