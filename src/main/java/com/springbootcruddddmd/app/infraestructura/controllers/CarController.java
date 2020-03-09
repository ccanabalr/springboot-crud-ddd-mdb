package com.springbootcruddddmd.app.infraestructura.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcruddddmd.app.application.CarApplication;
import com.springbootcruddddmd.app.dominio.modelo.Car;
import com.springbootcruddddmd.app.dominio.services.CarService;
import com.springbootcruddddmd.app.infraestructura.mapper.CarMapper;
import com.springbootcruddddmd.app.infraestructura.mapper.TypeCarMapper;
import com.springbootcruddddmd.app.infraestructura.rest.CarRestDto;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CarController {
	
	
	private CarApplication carApplication;
	@Autowired
	private CarMapper carMapper;
	@Autowired
	private TypeCarMapper typeCarMapper;
	
	public CarController(@Autowired CarService carService ) {
		this.carApplication =  new CarApplication(carService);
		
	}
	
	@GetMapping("/cars")
	public List<CarRestDto> findAll(){
		List<Car> cars = carApplication.findAll();
		return carMapper.apiDominioToDto(cars);
	}
	
	
	
	@PostMapping("/cars")
	public CarRestDto save(@RequestBody CarRestDto carRestDto) {
		typeCarMapper.apiDtoToDominio(carRestDto.getTypeCar());
		Car car = carApplication.save(carMapper.apiDtoToDominio(carRestDto));
		return carMapper.apiDominioToDto(car);
	}

}
