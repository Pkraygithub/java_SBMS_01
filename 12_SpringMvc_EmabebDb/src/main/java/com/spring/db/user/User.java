package com.spring.db.user;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_Master")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
	
	@NotEmpty(message="Enter Your User Name")
	@Size(max = 12,min = 3,message = "Min 3 and Max 12 Chars are allowed")
	private String uname;
	
	@Column(unique = true)
	@NotEmpty(message="Email is mandatory,Should be Valid Email")
	private String uemail;
	@NotEmpty(message="Enter password..")
	private String upwd;
	private Long uphonum;
	
	
	@CreationTimestamp
	private LocalDate createDate;
	@UpdateTimestamp
	private LocalDate updateDate;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer uid, String uname, String uemail, String upwd, Long uphonum) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uemail = uemail;
		this.upwd = upwd;
		this.uphonum = uphonum;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public Long getUphonum() {
		return uphonum;
	}
	public void setUphonum(Long uphonum) {
		this.uphonum = uphonum;
	}
	
	
	

	
}
