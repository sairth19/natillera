package com.tunatillera.core.model;

import java.time.LocalDate;

public class Partner {
	private Long code;
	private String fullName;
	private String identification;
	private LocalDate birthdDate;
	private LocalDate subscribedSince;
	private String status;
	private PartnerContactInfo contactInfo;
	
	public Partner() {}

	public Partner(Long code, String fullName, String identification, LocalDate birthdDate, LocalDate subscribedSince,
			String status, PartnerContactInfo contactInfo) {
		super();
		this.code = code;
		this.fullName = fullName;
		this.identification = identification;
		this.birthdDate = birthdDate;
		this.subscribedSince = subscribedSince;
		this.status = status;
		this.contactInfo = contactInfo;
	}

	public Long getCode() {
		return code;
	}
	
	public void setCode(Long code) {
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
	
	
	public LocalDate getBirthdDate() {
		return birthdDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthdDate = birthDate;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
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

	public PartnerContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(PartnerContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
}
