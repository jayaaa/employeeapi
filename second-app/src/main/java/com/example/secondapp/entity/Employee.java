package com.example.secondapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Employee {
	
	@Column(name = "EMP_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empid;
	@Column(name = "EMP_NAME")
	private String empname;
	@Column(name = "EMP_DOJ")
	private String empdoj;
	public Employee() {
		super();
	}
	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdoj() {
		return empdoj;
	}
	public void setEmpdoj(String empdoj) {
		this.empdoj = empdoj;
	}

}







