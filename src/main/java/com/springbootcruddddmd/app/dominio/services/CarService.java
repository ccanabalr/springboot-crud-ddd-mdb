package com.springbootcruddddmd.app.dominio.services;

import java.util.List;

import com.springbootcruddddmd.app.dominio.modelo.Car;
import com.springbootcruddddmd.app.shared.dominio.IdCar;

public interface CarService {
	
	public List<Car> findAll();
	public Car findById(IdCar idCar);
	public Car save(Car car);
	public void deleteById(IdCar idCar);

}
