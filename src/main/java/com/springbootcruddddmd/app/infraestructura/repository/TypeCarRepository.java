package com.springbootcruddddmd.app.infraestructura.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springbootcruddddmd.app.infraestructura.dto.TypeCarDto;

public interface TypeCarRepository extends MongoRepository<TypeCarDto, String> {

}
