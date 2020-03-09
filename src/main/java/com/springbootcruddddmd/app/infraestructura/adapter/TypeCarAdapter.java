package com.springbootcruddddmd.app.infraestructura.adapter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootcruddddmd.app.dominio.modelo.TypeCar;
import com.springbootcruddddmd.app.dominio.services.TypeCarService;
import com.springbootcruddddmd.app.infraestructura.dto.TypeCarDto;
import com.springbootcruddddmd.app.infraestructura.mapper.TypeCarMapper;
import com.springbootcruddddmd.app.infraestructura.repository.TypeCarRepository;
import com.springbootcruddddmd.app.shared.dominio.IdTypeCar;

@Service
public class TypeCarAdapter implements TypeCarService {
	
	@Autowired 
	private TypeCarRepository typeCarRepository;

	@Autowired
	private TypeCarMapper typeCarMapper;

	@Override
	public List<TypeCar> findAll() {
		List<TypeCarDto> typeCars = typeCarRepository.findAll();
		return typeCarMapper.dtoToDominio(typeCars);
	}

	@Override
	public TypeCar findById(IdTypeCar id) {
		TypeCarDto typeCarDto = typeCarRepository.findById(id.getId()).orElse(null);
		return typeCarMapper.dtoToDominio(typeCarDto);
	}

	@Override
	public TypeCar save(TypeCar typeCar) {
		TypeCarDto typeCarDto = typeCarRepository.save(typeCarMapper.dominioToDto(typeCar));
		return typeCarMapper.dtoToDominio(typeCarDto);
	}

	@Override
	public void deleteById(IdTypeCar id) {
		typeCarRepository.deleteById(id.getId());
	}

}
