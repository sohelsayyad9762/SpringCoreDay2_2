package com.tech;

public class Employee {
	
	private  String ename;
	private String eemail;
	private Address address;
	
	public Employee() {
		System.out.println("Inside Employee Cons....");
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEemail() {
		return eemail;
	}

	public void setEemail(String eemail) {
		this.eemail = eemail;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

}
