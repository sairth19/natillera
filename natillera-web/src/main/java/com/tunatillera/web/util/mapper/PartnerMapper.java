package com.tunatillera.web.util.mapper;

import com.tunatillera.core.model.Partner;
import com.tunatillera.web.entity.PartnerEntity;

public class PartnerMapper implements EntityModelMapper<PartnerEntity, Partner>{
	
	private static final PartnerContactInfoMapper INFO_MAPPER = new PartnerContactInfoMapper();

	@Override
	public Partner entityToModel(PartnerEntity entity) {
		Partner model = new Partner();
		model.setCode(entity.getCode());
		model.setFullName(entity.getFullName());
		model.setIdentification(entity.getIdentification());
		model.setBirthDate(entity.getBirthDate());
		model.setStatus(entity.getStatus());
		model.setSubscribedSince(entity.getSubscribedSince());
		
		if(entity.getContactInfo() != null) {
			model.setContactInfo(INFO_MAPPER.entityToModel(entity.getContactInfo()));
		}
		
		return model;
	}

	@Override
	public PartnerEntity modelToEntity(Partner model) {
		PartnerEntity entity = new PartnerEntity();
		entity.setCode(model.getCode());
		entity.setFullName(model.getFullName());
		entity.setIdentification(model.getIdentification());
		entity.setBirthDate(model.getBirthdDate());
		entity.setStatus(model.getStatus());
		entity.setSubscribedSince(model.getSubscribedSince());
		
		if(model.getContactInfo() != null) {
			entity.setContactInfo(INFO_MAPPER.modelToEntity(model.getContactInfo()));
		}

		return entity;
	}
	
}
