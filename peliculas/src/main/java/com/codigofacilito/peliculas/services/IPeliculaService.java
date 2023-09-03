package com.codigofacilito.peliculas.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.codigofacilito.peliculas.entities.Pelicula;

public interface IPeliculaService {

	public void save(Pelicula pelicula);

	public Pelicula findById(Long id);

	public List<Pelicula> findAll();
	
	public Page<Pelicula> findAll(Pageable pegable);

	public void delete(Long id);
}
