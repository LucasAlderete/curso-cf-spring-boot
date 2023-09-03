package com.codigofacilito.peliculas.services;

import java.util.List;

import com.codigofacilito.peliculas.entities.Actor;

public interface IActorService {
	public List<Actor> findAll();
	public List<Actor> findAllById(List<Long> ids);
}
