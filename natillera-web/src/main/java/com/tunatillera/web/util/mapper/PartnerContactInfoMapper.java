package com.tunatillera.web.util.mapper;

import com.tunatillera.core.model.PartnerContactInfo;
import com.tunatillera.web.entity.PartnerContactInfoEntity;

public class PartnerContactInfoMapper implements EntityModelMapper<PartnerContactInfoEntity, PartnerContactInfo>{

	@Override
	public PartnerContactInfo entityToModel(PartnerContactInfoEntity entity) {
		PartnerContactInfo info = new PartnerContactInfo();
		if(entity != null) {
			info.setCode(entity.getCode());
			info.setAddress(entity.getAddress());
			info.setCellphone(entity.getCellphone());
			info.setEmail(entity.getEmail());
			info.setHomephone(entity.getHomephone());
		}
		
		return info;
	}

	@Override
	public PartnerContactInfoEntity modelToEntity(PartnerContactInfo model) {
		PartnerContactInfoEntity info = new PartnerContactInfoEntity();
		if(model != null) {
			info.setCode(model.getCode());
			info.setAddress(model.getAddress());
			info.setCellphone(model.getCellphone());
			info.setEmail(model.getEmail());
			info.setHomephone(model.getHomephone());
		}
		return info;
	}
}
