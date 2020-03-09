package com.springbootcruddddmd.app.infraestructura.adapter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootcruddddmd.app.dominio.modelo.Car;
import com.springbootcruddddmd.app.dominio.services.CarService;
import com.springbootcruddddmd.app.infraestructura.dto.CarDto;
import com.springbootcruddddmd.app.infraestructura.mapper.CarMapper;
import com.springbootcruddddmd.app.infraestructura.repository.CarRepository;
import com.springbootcruddddmd.app.shared.dominio.IdCar;

@Service
public class CarAdapter implements CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	@Autowired 
	private CarMapper carMapper;

	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return carMapper.dtoToDominio(carRepository.findAll());
	}

	@Override
	public Car findById(IdCar idCar) {
		// TODO Auto-generated method stub
		return carMapper.dtoToDominio(carRepository.findById(idCar.getId()).orElse(null));
	}

	@Override
	public Car save(Car car) {
		CarDto carDto = carRepository.save(carMapper.dominioToDto(car));
		return carMapper.dtoToDominio(carDto);
	}

	@Override
	public void deleteById(IdCar idCar) {
		carRepository.deleteById(idCar.getId());
	}

}
