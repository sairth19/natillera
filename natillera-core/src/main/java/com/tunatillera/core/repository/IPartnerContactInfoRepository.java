package com.tunatillera.core.repository;

import com.tunatillera.core.model.PartnerContactInfo;

public interface IPartnerContactInfoRepository {
	PartnerContactInfo saveOrUpdate(PartnerContactInfo partner) throws RepositoryException;
}
