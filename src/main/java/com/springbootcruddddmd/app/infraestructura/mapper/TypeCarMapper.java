package com.springbootcruddddmd.app.infraestructura.mapper;

import org.springframework.stereotype.Component;

import com.springbootcruddddmd.app.dominio.modelo.TypeCar;
import com.springbootcruddddmd.app.infraestructura.dto.TypeCarDto;
import com.springbootcruddddmd.app.infraestructura.rest.TypeCarRestDto;
import com.springbootcruddddmd.app.shared.dominio.DescriptionTypeCar;
import com.springbootcruddddmd.app.shared.dominio.IdTypeCar;
import com.springbootcruddddmd.app.shared.dominio.NameTypeCar;
import com.springbootcruddddmd.app.shared.infraestructura.MapperApiRest;
import com.springbootcruddddmd.app.shared.infraestructura.MapperRepository;

@Component
public class TypeCarMapper implements MapperRepository<TypeCar, TypeCarDto>, MapperApiRest<TypeCar, TypeCarRestDto> {

	@Override
	public TypeCar apiDtoToDominio(TypeCarRestDto o) {
		// TODO Auto-generated method stub
		return TypeCar.of(
				new IdTypeCar(o.getId()), 
				new NameTypeCar(o.getName()), 
				new DescriptionTypeCar(o.getDescription()));
	}

	@Override
	public TypeCarRestDto apiDominioToDto(TypeCar i) {
		// TODO Auto-generated method stub
		return new TypeCarRestDto(
				i.getId().getId(), 
				i.getName().getName(), 
				i.getDescription().getDescription());
	}

	@Override
	public TypeCar dtoToDominio(TypeCarDto o) {
		// TODO Auto-generated method stub
		return TypeCar.of(
				new IdTypeCar(o.getId()), 
				new NameTypeCar(o.getName()),
				new DescriptionTypeCar(o.getDescription()));
	}

	@Override
	public TypeCarDto dominioToDto(TypeCar i) {
		// TODO Auto-generated method stub
		return new TypeCarDto(
				i.getId().getId(),
				i.getName().getName(),
				i.getDescription().getDescription());
	}

}
