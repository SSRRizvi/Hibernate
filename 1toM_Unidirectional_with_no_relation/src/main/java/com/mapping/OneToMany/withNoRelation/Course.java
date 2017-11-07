package com.mapping.OneToMany.withNoRelation;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Course")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int courseId;
	
	@Column(name="courseName")
	private String name;
	
	@Column(name="courseFee")
	private int fee;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_course_mapping", 
	  			joinColumns=@JoinColumn(name="courseId"),
	  			inverseJoinColumns=@JoinColumn(name="studentId")
	)
	private Set<Student> student = new HashSet<>();
	
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

}
