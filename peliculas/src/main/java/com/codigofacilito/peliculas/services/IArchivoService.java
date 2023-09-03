package com.codigofacilito.peliculas.services;

import java.io.InputStream;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;



public interface IArchivoService {

	public void guardar(String archivo, InputStream bytes);
	public void eliminar(String archivo);
	public ResponseEntity<Resource> get(String archivo);
	
}
