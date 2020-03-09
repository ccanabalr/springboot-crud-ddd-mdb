package com.springbootcruddddmd.app.infraestructura.rest;

public class CarRestDto {

	private String id;
	private String marca;
	private String modelo;
	private String color;
	private TypeCarRestDto typeCar;

	public CarRestDto() {
		// TODO Auto-generated constructor stub
	}

	public CarRestDto(String id, String marca, String modelo, String color,TypeCarRestDto typeCar) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.typeCar = typeCar;
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

	public TypeCarRestDto getTypeCar() {
		return typeCar;
	}

	public void setTypeCar(TypeCarRestDto typeCar) {
		this.typeCar = typeCar;
	}
	
	

}
