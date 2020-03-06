package com.tunatillera.web.resource.vo.request.partner;

import java.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.tunatillera.core.model.Partner;
import com.tunatillera.core.model.PartnerContactInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatePartnerRequestVO {
	
	@NotNull
	@NotBlank
	@Length(min = 8, max = 255 )
	private String fullName;
	
	@NotNull
	@NotBlank
	@Length(min = 6, max = 15)
	private String identification;
	
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;
	
	@Valid
	private ContactInfo contactInfo;
	
	public static Partner toModel(CreatePartnerRequestVO partner) {
		Partner model =  new Partner();
		model.setFullName(partner.getFullName());
		model.setIdentification(partner.getIdentification());
		model.setBirthDate(partner.getBirthDate());
		
		PartnerContactInfo contactInfo = new PartnerContactInfo();
		final ContactInfo contactInfoAux = partner.getContactInfo();
		contactInfo.setAddress(contactInfoAux.getAddress());
		contactInfo.setCellphone(contactInfoAux.getCellphone());
		contactInfo.setEmail(contactInfoAux.getEmail());
		contactInfo.setHomephone(contactInfoAux.getHomephone());
		model.setContactInfo(contactInfo);
		
		return model;
	}
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	class ContactInfo{
		
		@NotNull
		@NotBlank
		@Length(min = 10, max = 255 )
		private String email;
		
		@Length(min = 5, max = 15 )
		private String homephone;
		
		@NotNull
		@NotBlank
		@Length(min = 8, max = 15 )
		private String cellphone;
		
		@NotNull
		@NotBlank
		@Length(min = 10, max = 255 )
		private String address;
	}
}