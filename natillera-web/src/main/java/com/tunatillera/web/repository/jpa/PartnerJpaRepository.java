package com.tunatillera.web.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tunatillera.web.entity.PartnerEntity;

@Repository
public interface PartnerJpaRepository extends JpaRepository<PartnerEntity, Long> {

}
