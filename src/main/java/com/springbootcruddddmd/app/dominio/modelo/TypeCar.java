package com.springbootcruddddmd.app.dominio.modelo;

import com.springbootcruddddmd.app.shared.dominio.DescriptionTypeCar;
import com.springbootcruddddmd.app.shared.dominio.IdTypeCar;
import com.springbootcruddddmd.app.shared.dominio.NameTypeCar;

public class TypeCar {

	private final IdTypeCar id;
	private final NameTypeCar name;
	private final DescriptionTypeCar description;

	public static TypeCar of(IdTypeCar id, NameTypeCar name, DescriptionTypeCar description) {
		return new TypeCar(id, name, description);
	}

	private TypeCar(IdTypeCar id, NameTypeCar name, DescriptionTypeCar description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public IdTypeCar getId() {
		return id;
	}

	public NameTypeCar getName() {
		return name;
	}

	public DescriptionTypeCar getDescription() {
		return description;
	}

}
