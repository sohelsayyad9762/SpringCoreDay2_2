package com.tech;

public class Address {
	
	private String cityname;
	private String pincode;
	
	
	


	public Address() {
		System.out.println("Inside Address Cons...");
	}


	public String getCityname() {
		return cityname;
	}


	public void setCityname(String cityname) {
		this.cityname = cityname;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
