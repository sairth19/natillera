package com.tunatillera.core.repository;

import com.tunatillera.core.model.Partner;

public interface IPartnerRepository {
	Partner saveOrUpdate(Partner partner) throws RepositoryException;
	boolean partnerAlreadyExist(String partnerIdentification);
}
