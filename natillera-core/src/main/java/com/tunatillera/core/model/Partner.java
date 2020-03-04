package com.tunatillera.core.model;

import java.math.BigInteger;
import java.time.LocalDate;

public class Partner {
	private BigInteger code;
	private String fullName;
	private String identification;
	private String email;
	private String address;
	private LocalDate subscribedSince;
	private String status;
	
	public Partner() {}
	
	public Partner(BigInteger code, String fullName, String identification, String email, String address,
			LocalDate subscribedSince, String status) {
		super();
		this.code = code;
		this.fullName = fullName;
		this.identification = identification;
		this.email = email;
		this.address = address;
		this.subscribedSince = subscribedSince;
		this.status = status;
	}

	public BigInteger getCode() {
		return code;
	}
	
	public void setCode(BigInteger code) {
		this.code = code;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getIdentification() {
		return identification;
	}
	
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public LocalDate getSubscribedSince() {
		return subscribedSince;
	}
	
	public void setSubscribedSince(LocalDate subscribedSince) {
		this.subscribedSince = subscribedSince;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
