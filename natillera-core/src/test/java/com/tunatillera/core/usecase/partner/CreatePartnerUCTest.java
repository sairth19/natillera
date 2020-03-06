package com.tunatillera.core.usecase.partner;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.tunatillera.core.model.Partner;
import com.tunatillera.core.repository.IPartnerRepository;
import com.tunatillera.core.repository.RepositoryException;
import com.tunatillera.core.usecase.UseCaseReponse;

public class CreatePartnerUCTest {
	
	@Test
	public void createPartner() throws RepositoryException{
		Partner partner = getPartner();
		final IPartnerRepository partnerRepository = Mockito.mock(IPartnerRepository.class);
		final CreatePartnerUC createPartnerUC = new CreatePartnerUC(partnerRepository);
		
		Mockito.when(partnerRepository.partnerAlreadyExist(partner.getIdentification())).thenReturn(false);
		Mockito.when(partnerRepository.saveOrUpdate(partner)).thenReturn(partner);
		
		final UseCaseReponse<Partner> response = createPartnerUC.execute(partner);
		
		Assert.assertEquals(CreatePartnerUC.PARTNER_CREATED_SUCCESSFULLY, response.getStatusCode());
		Assert.assertEquals(PartnerStatusEnum.ACTIVE.getCode(), response.getOutput().getStatus());
		Assert.assertNotNull(response.getOutput().getSubscribedSince());
	}
	
	@Test
	public void createPartnerWhenPartnerAlreadyExists() throws RepositoryException {
		Partner partner = getPartner();
		final IPartnerRepository partnerRepository = Mockito.mock(IPartnerRepository.class);
		final CreatePartnerUC createPartnerUC = new CreatePartnerUC(partnerRepository);
		
		Mockito.when(partnerRepository.partnerAlreadyExist(partner.getIdentification())).thenReturn(true);
		Mockito.when(partnerRepository.saveOrUpdate(partner)).thenReturn(partner);
		
		final UseCaseReponse<Partner> response = createPartnerUC.execute(partner);
		Assert.assertEquals(CreatePartnerUC.PARTNER_ALREADY_EXISTS, response.getStatusCode());
	}
	
	
	
	private Partner getPartner() {
		Partner partner = new Partner();
		partner.setFullName("John Doe");
		partner.setIdentification("123456789");
		
		return partner;
	}

}
