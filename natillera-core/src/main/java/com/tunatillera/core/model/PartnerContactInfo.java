package com.tunatillera.core.model;

public class PartnerContactInfo {
	private Long code;
	private String email;
	private String homephone;
	private String cellphone;
	private String address;
	
	public PartnerContactInfo() {
	}

	public PartnerContactInfo(Long code, String email, String homephone, String cellphone, String address) {
		super();
		this.code = code;
		this.email = email;
		this.homephone = homephone;
		this.cellphone = cellphone;
		this.address = address;
	}

	
	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
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
