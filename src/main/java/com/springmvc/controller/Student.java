package com.springmvc.controller;

public class Student {


	private String studentName;
	private String studentemail;
	private String studentdob ;

	private Address address;

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentdob() {
		return studentdob;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	public void setStudentdob(String studentdob) {
		this.studentdob = studentdob;
	}


}

