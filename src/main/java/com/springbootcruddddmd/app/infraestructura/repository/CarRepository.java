package com.springbootcruddddmd.app.infraestructura.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.springbootcruddddmd.app.infraestructura.dto.CarDto;

public interface CarRepository extends MongoRepository<CarDto, String> {

}
