package com.data.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class EmpData {
	
	@Id
	private Integer eid;
	private String ename;
	private Double esalary;
	private String egender;
	private String eCountery;
	
	
	public EmpData() {
		
	}
	
	
	public EmpData(Integer eid, String ename, Double esalary, String egender, String eCountery) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.egender = egender;
		this.eCountery = eCountery;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getEsalary() {
		return esalary;
	}
	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}
	public String getEgender() {
		return egender;
	}
	public void setEgender(String egender) {
		this.egender = egender;
	}
	public String geteCountery() {
		return eCountery;
	}
	public void seteCountery(String eCountery) {
		this.eCountery = eCountery;
	}
	@Override
	public String toString() {
		return "EmpData [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", egender=" + egender
				+ ", eCountery=" + eCountery + "]";
	}
	
	

}
