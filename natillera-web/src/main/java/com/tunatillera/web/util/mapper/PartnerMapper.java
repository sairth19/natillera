package com.tunatillera.web.util.mapper;

import com.tunatillera.core.model.Partner;
import com.tunatillera.web.entity.PartnerEntity;

public class PartnerMapper implements EntityModelMapper<PartnerEntity, Partner>{

	@Override
	public Partner entityToModel(PartnerEntity entity) {
		Partner model = new Partner();
		model.setCode(entity.getCode());
		model.setFullName(entity.getFullName());
		model.setIdentification(entity.getIdentification());
		model.setStatus(entity.getStatus());
		model.setSubscribedSince(entity.getSubscribedSince());
		
		return model;
	}

	@Override
	public PartnerEntity modelToEntity(Partner model) {
		PartnerEntity entity = new PartnerEntity();
		entity.setCode(model.getCode());
		entity.setFullName(model.getFullName());
		entity.setIdentification(model.getIdentification());
		entity.setStatus(model.getStatus());
		entity.setSubscribedSince(model.getSubscribedSince());

		return entity;
	}
	
}
