package com.spring.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String name;
	private String email;
	private Long phonum;
	
	@CreationTimestamp
	private LocalDate createDate;
	@UpdateTimestamp
	private LocalDate updateDate;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Integer sid, String name, String email, Long phonum, LocalTime createDate, LocalTime updateDate) {
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.phonum = phonum;
		
	}
	
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhonum() {
		return phonum;
	}
	public void setPhonum(Long phonum) {
		this.phonum = phonum;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", phonum=" + phonum + "]";
	}
	
	
	
	
	
}
