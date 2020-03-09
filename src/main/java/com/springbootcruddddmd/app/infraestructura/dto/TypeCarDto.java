package com.springbootcruddddmd.app.infraestructura.dto;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "type-cars")
public class TypeCarDto {
	
	@Id
	private String id = new ObjectId().toString();
	
	private String name;
	
	private String description;
	
	public TypeCarDto() {
		// TODO Auto-generated constructor stub
	}

	public TypeCarDto(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	
	

}
