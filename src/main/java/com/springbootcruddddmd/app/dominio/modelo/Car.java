package com.springbootcruddddmd.app.dominio.modelo;

import com.springbootcruddddmd.app.shared.dominio.Color;
import com.springbootcruddddmd.app.shared.dominio.IdCar;
import com.springbootcruddddmd.app.shared.dominio.Marca;
import com.springbootcruddddmd.app.shared.dominio.Modelo;

public class Car {

	private final IdCar id;
	private final Marca marca;
	private final Modelo modelo;
	private final Color color;
	private final TypeCar typeCar;
	
	
	public static Car of(IdCar id, Marca marca, Modelo modelo, Color color, TypeCar typeCar) {
		return new Car(id, marca, modelo, color, typeCar);
	}
	
	private Car(IdCar idCar, Marca marca, Modelo modelo, Color color, TypeCar typeCar) {
		super();
		this.id = idCar;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.typeCar = typeCar;
	}
	public IdCar getId() {
		return id;
	}
	public Marca getMarca() {
		return marca;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public Color getColor() {
		return color;
	}

	public TypeCar getTypeCar() {
		return typeCar;
	}
	
	
	
	
}
