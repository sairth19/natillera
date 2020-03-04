package com.tunatillera.core.usecase.partner;

import java.time.LocalDate;

import com.tunatillera.core.model.Partner;
import com.tunatillera.core.repository.IPartnerRepository;
import com.tunatillera.core.repository.RepositoryException;
import com.tunatillera.core.usecase.IUseCase;
import com.tunatillera.core.usecase.UseCaseReponse;

public class CreatePartnerUC implements IUseCase<Partner, UseCaseReponse<Partner>> {
	
	private IPartnerRepository partnerRepository;
	
	public static final int PARTNER_ALREADY_EXISTS = 505;
	public static final int PARTNER_CREATED_SUCCESSFULLY = 500;
	
	public CreatePartnerUC(IPartnerRepository partnerRepository) {
		this.partnerRepository = partnerRepository;
	}

	public UseCaseReponse<Partner> execute(Partner partner) {
		return this.createPartner(partner);
	}
	
	private UseCaseReponse<Partner> createPartner(Partner partner) {
		UseCaseReponse<Partner> response = new UseCaseReponse<Partner>();
		
		if(this.partnerRepository.partnerAlreadyExist(partner.getIdentification())) {
			response.setOutput(partner);
			response.setStatusCode(PARTNER_ALREADY_EXISTS);
		} else {
			partner.setSubscribedSince(LocalDate.now());
			
			try {
				partner = partnerRepository.saveOrUpdate(partner);
				response.setOutput(partner);
				response.setStatusCode(PARTNER_CREATED_SUCCESSFULLY);
			}catch(RepositoryException ex) {
				// Do something smart
			}
		}
		return response;
	}
	
	
	
}
