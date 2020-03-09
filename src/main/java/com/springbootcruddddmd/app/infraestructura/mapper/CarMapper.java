package com.springbootcruddddmd.app.infraestructura.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbootcruddddmd.app.dominio.modelo.Car;
import com.springbootcruddddmd.app.infraestructura.dto.CarDto;
import com.springbootcruddddmd.app.infraestructura.rest.CarRestDto;
import com.springbootcruddddmd.app.shared.dominio.Color;
import com.springbootcruddddmd.app.shared.dominio.IdCar;
import com.springbootcruddddmd.app.shared.dominio.Marca;
import com.springbootcruddddmd.app.shared.dominio.Modelo;
import com.springbootcruddddmd.app.shared.infraestructura.MapperApiRest;
import com.springbootcruddddmd.app.shared.infraestructura.MapperRepository;

@Component
public class CarMapper implements MapperRepository<Car, CarDto>, MapperApiRest<Car, CarRestDto> {

	@Autowired
	private TypeCarMapper typeCarMapper;
	@Override
	public Car apiDtoToDominio(CarRestDto o) {
		// TODO Auto-generated method stub
		return Car.of(new IdCar(o.getId()), new Marca(o.getMarca()), 
				new Modelo(o.getModelo()), new Color(o.getColor()),
				typeCarMapper.apiDtoToDominio(o.getTypeCar()));
	}

	@Override
	public CarRestDto apiDominioToDto(Car i) {
		// TODO Auto-generated method stub
		return new CarRestDto(i.getId().getId(), i.getMarca().getMarca(),
				i.getModelo().getModelo(), i.getColor().getColor(),
				typeCarMapper.apiDominioToDto(i.getTypeCar()));
	}

	@Override
	public Car dtoToDominio(CarDto o) {
		return Car.of(new IdCar(o.getId()), new Marca(o.getMarca()),
				new Modelo(o.getModelo()), new Color(o.getColor()),
				typeCarMapper.dtoToDominio(o.getTypeCars()));
	}

	@Override
	public CarDto dominioToDto(Car i) {
		// TODO Auto-generated method stub
		return new CarDto(i.getId().getId(), i.getMarca().getMarca(),
				i.getModelo().getModelo(), i.getColor().getColor(),
				typeCarMapper.dominioToDto(i.getTypeCar()));
	}

}
