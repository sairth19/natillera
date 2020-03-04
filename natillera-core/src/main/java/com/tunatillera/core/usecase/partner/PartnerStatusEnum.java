package com.tunatillera.core.usecase.partner;

public enum PartnerStatusEnum {
	ACTIVE("AC", "Activo"),
	SUSPENDED("SU", "Suspendido"),
	INACTIVE("IN", "Inactivo");
	
	private String code;
	private String label;	
	
	private PartnerStatusEnum(String code, String label) {
		this.code = code;
		this.label = label;
	}

	public String getCode() {
		return code;
	}

	public String getLabel() {
		return label;
	}	
}
