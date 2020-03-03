package com.tunatillera.core.model;

import java.time.LocalDate;

public class Natillera {
	private String name;
	private String description;
	private LocalDate creationDate;
	private String status;
	
	
	public Natillera(String name, String description, LocalDate creationDate, String status) {
		super();
		this.name = name;
		this.description = description;
		this.creationDate = creationDate;
		this.status = status;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public LocalDate getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
