package com.mapping.m2m;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private int user_id;
	  
	  @Column
	  private String userName;
	  
	  @Column
	  private String password;
	  
	  @Column
	  private String email;

	  @ManyToMany(cascade=CascadeType.ALL, mappedBy="userList")
	  private Set<Groups> groupList = new HashSet<Groups>();

	  
	public Set<Groups> getGroupList() {
		return groupList;
	}

	public void setGroupList(Set<Groups> groupList) {
		this.groupList = groupList;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	  
}
