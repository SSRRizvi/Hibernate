package com.mapping.m2m;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="groups")
public class Groups {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int group_id;
	
	@Column	
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="users_groups", 
			joinColumns=@JoinColumn(name="group_id"), 
			inverseJoinColumns=@JoinColumn(name="user_id") 
	)
	private Set<Users> userList = new HashSet<Users>();

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Users> getUserList() {
		return userList;
	}

	public void setUserList(Set<Users> userList) {
		this.userList = userList;
	}

}
