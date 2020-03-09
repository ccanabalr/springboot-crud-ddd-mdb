package com.springbootcruddddmd.app.application;

import java.util.List;

import com.springbootcruddddmd.app.dominio.modelo.TypeCar;
import com.springbootcruddddmd.app.dominio.services.TypeCarService;
import com.springbootcruddddmd.app.shared.dominio.IdTypeCar;

public class TypeCarApplication {
	
	private TypeCarService typeCarService;
	public TypeCarApplication(TypeCarService typeCarService) {
		this.typeCarService = typeCarService;
	}
	
	public List<TypeCar> findAll(){
		return typeCarService.findAll();
	}
	
	public TypeCar findById(IdTypeCar id) {
		return typeCarService.findById(id);
	}
	
	public TypeCar save(TypeCar typeCar) {
		return typeCarService.save(typeCar);
	}
	
	public void deleteById(IdTypeCar id) {
		 typeCarService.deleteById(id);
	}

}
