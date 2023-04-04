package com.example.JpaManytoMany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="COURSE_TBL")
public class Course {
@Id
@GeneratedValue
private Long id;
private String title;
private String abbrevation;
public Course(Long id, String title, String abbrevation, int modules, double fee, long studentid,
		Set<Student> students) {
	//super();
	this.id = id;
	this.title = title;
	this.abbrevation = abbrevation;
	this.modules = modules;
	this.fee = fee;
	this.studentid = studentid;
	this.students = students;
}




public Long getId() {
	return id;
}




public void setId(Long id) {
	this.id = id;
}




public String getTitle() {
	return title;
}




public void setTitle(String title) {
	this.title = title;
}




public String getAbbrevation() {
	return abbrevation;
}




public void setAbbrevation(String abbrevation) {
	this.abbrevation = abbrevation;
}




public int getModules() {
	return modules;
}




public void setModules(int modules) {
	this.modules = modules;
}




public double getFee() {
	return fee;
}




public void setFee(double fee) {
	this.fee = fee;
}




public long getStudentid() {
	return studentid;
}




public void setStudentid(long studentid) {
	this.studentid = studentid;
}




public Set<Student> getStudents() {
	return students;
}




public void setStudents(Set<Student> students) {
	this.students = students;
}




private int modules;
private double fee;
private long studentid;




@ManyToMany(mappedBy="courses",fetch=FetchType.LAZY)
@JsonManagedReference
private Set<Student> students;

}
