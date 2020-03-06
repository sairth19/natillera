package com.tunatillera.web.resource.vo.partner;

import com.tunatillera.core.model.Partner;
import com.tunatillera.core.model.PartnerContactInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartnerContactInfoVO {
	private String email;
	private String homephone;
	private String cellphone;
	private String address;
	
	
	public static PartnerContactInfoVO toVO(PartnerContactInfo info) {
		PartnerContactInfoVO vo =  new PartnerContactInfoVO();
		
		vo.setAddress(info.getAddress());
		vo.setCellphone(info.getCellphone());
		vo.setEmail(info.getEmail());
		vo.setHomephone(info.getHomephone());
		
		return vo;
	}
	
	public static PartnerContactInfo toModel(PartnerContactInfoVO info) {
		PartnerContactInfo model =  new PartnerContactInfo();
		
		model.setAddress(info.getAddress());
		model.setCellphone(info.getCellphone());
		model.setEmail(info.getEmail());
		model.setHomephone(info.getHomephone());
		
		return model;
	}
}
