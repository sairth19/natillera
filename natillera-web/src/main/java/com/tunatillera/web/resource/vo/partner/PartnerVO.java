package com.tunatillera.web.resource.vo.partner;

import java.time.LocalDate;

import com.tunatillera.core.model.Partner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartnerVO {
	private Long code;
	private String fullName;
	private String identification;
	private String email;
	private String address;
	private LocalDate subscribedSince;
	private String status;
	
	public static PartnerVO toVO(Partner partner) {
		PartnerVO vo =  new PartnerVO();
		
		vo.setCode(partner.getCode());
		vo.setFullName(partner.getFullName());
		vo.setIdentification(partner.getIdentification());
		vo.setSubscribedSince(partner.getSubscribedSince());
		vo.setStatus(partner.getStatus());
		
		
		return vo;
	}
	
	public static Partner toModel(PartnerVO partner) {
		Partner model =  new Partner();
		
		model.setCode(partner.getCode());
		model.setFullName(partner.getFullName());
		model.setIdentification(partner.getIdentification());
		model.setSubscribedSince(partner.getSubscribedSince());
		model.setStatus(partner.getStatus());
		
		return model;
	}
}
