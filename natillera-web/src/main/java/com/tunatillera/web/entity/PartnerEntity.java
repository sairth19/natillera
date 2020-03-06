package com.tunatillera.web.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "un_partners")
public class PartnerEntity {
	private Long code;
	private String fullName;
	private String identification;
	private LocalDate birthDate;
	private LocalDate subscribedSince;
	private String status;
	private PartnerContactInfoEntity contactInfo;
	
	public PartnerEntity() {}

	public PartnerEntity(Long code, String fullName, String identification, LocalDate birthDate,
			LocalDate subscribedSince, String status) {
		super();
		this.code = code;
		this.fullName = fullName;
		this.identification = identification;
		this.birthDate = birthDate;
		this.subscribedSince = subscribedSince;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ptr_code")
	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	@Column(name = "ptr_full_name", length=255, nullable = false)
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "ptr_identification", length=15, nullable = false)
	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	@Column(name = "ptr_birthdate", nullable = false)
	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Column(name = "ptr_subscribed_since", nullable = false)
	public LocalDate getSubscribedSince() {
		return subscribedSince;
	}

	public void setSubscribedSince(LocalDate subscribedSince) {
		this.subscribedSince = subscribedSince;
	}

	@Column(name = "ptr_status", length=2, nullable = false)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "ptr_pci_id", referencedColumnName = "pci_code")
	public PartnerContactInfoEntity getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(PartnerContactInfoEntity contactInfo) {
		this.contactInfo = contactInfo;
	}
}
