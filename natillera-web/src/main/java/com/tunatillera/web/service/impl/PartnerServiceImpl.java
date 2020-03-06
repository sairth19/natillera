package com.tunatillera.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunatillera.core.model.Partner;
import com.tunatillera.core.repository.IPartnerRepository;
import com.tunatillera.core.usecase.UseCaseReponse;
import com.tunatillera.core.usecase.partner.CreatePartnerUC;
import com.tunatillera.web.service.IPartnerService;

@Service
public class PartnerServiceImpl implements IPartnerService {
	
	@Autowired
	IPartnerRepository partnerRepository;
	
	public PartnerServiceImpl(IPartnerRepository partnerRepository) {
		this.partnerRepository = partnerRepository;
	}

	@Override
	public Partner createPartner(Partner partner) {
		final CreatePartnerUC createPartnerUC = new CreatePartnerUC(partnerRepository);
		UseCaseReponse<Partner> response = createPartnerUC.execute(partner);
		
		return response.getOutput();
	}

}
