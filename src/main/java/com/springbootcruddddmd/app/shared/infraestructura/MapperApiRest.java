package com.springbootcruddddmd.app.shared.infraestructura;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface MapperApiRest<I, O> {

	public I apiDtoToDominio(O o);
	
	public O apiDominioToDto(I i);
	
	public default List<I> apiDtoToDominio(List<O> instances){
		Optional<List<O>> listInstances =  Optional.ofNullable(instances);
		if(!listInstances.isPresent()) return new ArrayList<I>(); 
		return instances.stream().map(i -> apiDtoToDominio(i)).collect(Collectors.toList());
	}
	
	public default List<O> apiDominioToDto(List<I> instances) 
	{
		Optional<List<I>> listInstances = Optional.of(instances);
		if(!listInstances.isPresent()) new ArrayList<O>();
		return instances.stream().map(o -> apiDominioToDto(o)).collect(Collectors.toList());
	}
}
