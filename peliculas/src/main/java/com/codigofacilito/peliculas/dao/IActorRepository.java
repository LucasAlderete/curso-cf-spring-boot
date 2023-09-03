package com.codigofacilito.peliculas.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codigofacilito.peliculas.entities.Actor;

public interface IActorRepository extends CrudRepository<Actor, Long> {

	List<Actor> findAll();

}
