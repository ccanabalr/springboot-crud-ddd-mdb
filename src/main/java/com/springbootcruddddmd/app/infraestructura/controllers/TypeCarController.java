
package com.springbootcruddddmd.app.infraestructura.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcruddddmd.app.application.TypeCarApplication;
import com.springbootcruddddmd.app.dominio.modelo.TypeCar;
import com.springbootcruddddmd.app.dominio.services.TypeCarService;
import com.springbootcruddddmd.app.infraestructura.mapper.TypeCarMapper;
import com.springbootcruddddmd.app.infraestructura.rest.TypeCarRestDto;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class TypeCarController {
	
	private TypeCarApplication typeCarApplication;
	@Autowired
	private TypeCarMapper typeCarMapper;
	
	public TypeCarController(@Autowired TypeCarService typeCarService) {
		this.typeCarApplication = new TypeCarApplication(typeCarService);
	}
	
	@GetMapping("/type-cars")
	public List<TypeCarRestDto> findAll(){
		List<TypeCar> typeCars = typeCarApplication.findAll();
		return typeCarMapper.apiDominioToDto(typeCars);
	}
	
	
	@PostMapping("/type-cars")
	public TypeCarRestDto save(@RequestBody TypeCarRestDto carRestDto) {
		TypeCar typeCar = typeCarMapper.apiDtoToDominio(carRestDto);
		return typeCarMapper.apiDominioToDto(typeCarApplication.save(typeCar));
	}

}
