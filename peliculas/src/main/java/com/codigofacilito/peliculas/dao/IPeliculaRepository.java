package com.codigofacilito.peliculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codigofacilito.peliculas.entities.Pelicula;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Long> {

}
