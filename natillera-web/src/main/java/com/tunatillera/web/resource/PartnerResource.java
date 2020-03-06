package com.tunatillera.web.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tunatillera.core.model.Partner;
import com.tunatillera.web.resource.vo.request.partner.CreatePartnerRequestVO;
import com.tunatillera.web.service.IPartnerService;

@RestController
public class PartnerResource {

	@Autowired
	IPartnerService partnerService;
	
	@PostMapping("")
	public Partner createPartner(@Valid @RequestBody CreatePartnerRequestVO partner) {
		Partner partnerModel = CreatePartnerRequestVO.toModel(partner);
		return partnerService.createPartner(partnerModel);
	}
}
