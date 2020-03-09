package com.springbootcruddddmd.app.infraestructura.dto;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cars")
public class CarDto {

	@Id
	private String id = new ObjectId().toString();
	private String marca;
	private String modelo;
	private String color;
	private TypeCarDto typeCars;

	public CarDto() {

	}

	public CarDto(String id, String marca, String modelo, String color, TypeCarDto typeCars) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.typeCars = typeCars;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public TypeCarDto getTypeCars() {
		return typeCars;
	}

	public void setTypeCars(TypeCarDto typeCars) {
		this.typeCars = typeCars;
	}
	
	

}
