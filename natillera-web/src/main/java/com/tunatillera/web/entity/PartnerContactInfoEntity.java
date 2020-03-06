package com.tunatillera.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="un_partners_cinfo")
public class PartnerContactInfoEntity {
	private Long code;
	private String email;
	private String homephone;
	private String cellphone;
	private String address;
	private PartnerEntity partner;
	
	public PartnerContactInfoEntity() {}
	
	public PartnerContactInfoEntity(String email, String homephone, String cellphone, String address) {
		this.email = email;
		this.homephone = homephone;
		this.cellphone = cellphone;
		this.address = address;
	}

	@Id
	@Column(name = "pci_code")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}

	@Column(name = "pci_email", length=255, nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name = "pci_homephone", length=15, nullable = true)
	public String getHomephone() {
		return homephone;
	}
	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}
	@Column(name = "pci_celphone", length=15, nullable = false)
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	@Column(name = "pci_addres", length=15, nullable = false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@OneToOne(mappedBy = "contactInfo")
	public PartnerEntity getPartner() {
		return partner;
	}
	public void setPartner(PartnerEntity partner) {
		this.partner = partner;
	}
}
