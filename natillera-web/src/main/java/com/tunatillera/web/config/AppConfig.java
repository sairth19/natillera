package com.tunatillera.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tunatillera.web.repository.PartnerRepositoryAdapter;

@Configuration
public class AppConfig {
	
	@Bean
	PartnerRepositoryAdapter getPartnerRepositoryAdapter() {
		return new PartnerRepositoryAdapter();
	}
}
