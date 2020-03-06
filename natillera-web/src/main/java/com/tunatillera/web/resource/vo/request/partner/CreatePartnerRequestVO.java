package com.tunatillera.web.resource.vo.request.partner;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.tunatillera.core.model.Partner;

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
	@NotBlank
	@Length(min = 10, max = 255 )
	private String email;
	
	@NotNull
	@NotBlank
	@Length(min = 10, max = 255 )
	private String address;
	
	public static Partner toModel(CreatePartnerRequestVO partner) {
		Partner model =  new Partner();
		model.setFullName(partner.getFullName());
		model.setIdentification(partner.getIdentification());
		
		return model;
	}
}
