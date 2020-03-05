package com.tunatillera.web.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.tunatillera.core.model.Partner;
import com.tunatillera.core.repository.IPartnerRepository;
import com.tunatillera.core.repository.RepositoryException;
import com.tunatillera.web.entity.PartnerEntity;
import com.tunatillera.web.repository.jpa.PartnerJpaRepository;
import com.tunatillera.web.util.mapper.PartnerMapper;

public class PartnerRepositoryAdapter implements IPartnerRepository {
	
	@Autowired
	private PartnerJpaRepository repository;
	
	private static final PartnerMapper PARTNER_MAPPER = new PartnerMapper();
	
	public PartnerRepositoryAdapter(PartnerJpaRepository repository) {
		this.repository = repository;
	}

	@Override
	public Partner saveOrUpdate(Partner partner) throws RepositoryException {
		PartnerEntity entity = PARTNER_MAPPER.modelToEntity(partner);
		try {
			entity = repository.save(entity);
		}catch(DataAccessException ex) {
			throw new RepositoryException();
		}
		
		return PARTNER_MAPPER.entityToModel(entity);
	}

	@Override
	public boolean partnerAlreadyExist(String partnerIdentification) {
		// TODO Auto-generated method stub
		return false;
	}

}
