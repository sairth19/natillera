package com.tunatillera.core.model;

public class PartnerContactInfo {
	private String email;
	private String homephone;
	private String cellphone;
	private String address;
	
	public PartnerContactInfo() {
	}

	public PartnerContactInfo(String email, String homephone, String cellphone, String address) {
		super();
		this.email = email;
		this.homephone = homephone;
		this.cellphone = cellphone;
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
