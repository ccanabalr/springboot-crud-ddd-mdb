package com.springbootcruddddmd.app.application;

import java.util.List;



import com.springbootcruddddmd.app.dominio.modelo.Car;
import com.springbootcruddddmd.app.dominio.services.CarService;
import com.springbootcruddddmd.app.shared.dominio.IdCar;

public class CarApplication {
	
	
	private CarService carService;
	
	public CarApplication(CarService carService) {
		this.carService = carService;
	}
	
	public List<Car> findAll(){
		return carService.findAll();
	}
	
	public Car findById(IdCar idCar) {
		return carService.findById(idCar);
	}
	
	public Car save(Car car) {
		return carService.save(car);
	}
	
	public void deleteById(IdCar idCar) {
		carService.deleteById(idCar);
	}
}
