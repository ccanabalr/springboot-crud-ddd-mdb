package com.springbootcruddddmd.app.dominio.services;

import java.util.List;

import com.springbootcruddddmd.app.dominio.modelo.TypeCar;
import com.springbootcruddddmd.app.shared.dominio.IdTypeCar;

public interface TypeCarService {

	public List<TypeCar> findAll();
	public TypeCar findById(IdTypeCar id);
	public TypeCar save(TypeCar typeCar);
	public void deleteById(IdTypeCar id);
	
}
