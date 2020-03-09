package com.springbootcruddddmd.app.shared.infraestructura;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public interface MapperRepository<I, O> {
	
	public I dtoToDominio(O o);

	public O dominioToDto(I i);

	public default List<I> dtoToDominio(List<O> instances) {
		return instances.stream().map(i -> dtoToDominio(i)).collect(Collectors.toList());
	}

	public default List<O> convertDomainToDto(List<I> instances) 
	{
		Optional<List<I>> lista = Optional.of(instances);
		if(! lista.isPresent()) return new ArrayList<O>();
		return instances.stream().map(o -> dominioToDto(o)).collect(Collectors.toList());
	}

}
