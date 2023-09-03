package com.codigofacilito.ejemplos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codigofacilito.ejemplos.models.Equipo;
import com.codigofacilito.ejemplos.models.Jugador;

@Service("equiposEspaña")
public class EquipoService implements IService {
	
	public List<Equipo> getTodos() {
		Equipo barcelona = new Equipo();
		barcelona.setNombre("Barcelona");
		barcelona.addJugador(new Jugador("TER STEGEN", 1));
		barcelona.addJugador(new Jugador("ARAUJO", 4));
		barcelona.addJugador(new Jugador("BUSQUETS", 5));
		barcelona.addJugador(new Jugador("LEWANDOSKI", 9));
		barcelona.addJugador(new Jugador("DEMBELE", 7));

		Equipo realMadrid = new Equipo();
		realMadrid.setNombre("RealMadrid");
		realMadrid.addJugador(new Jugador("COURTOIS", 1));
		realMadrid.addJugador(new Jugador("CARVAJAL", 2));
		realMadrid.addJugador(new Jugador("MODRIC", 10));
		realMadrid.addJugador(new Jugador("BENZEMA", 9));
		realMadrid.addJugador(new Jugador("HAZARD", 7));

		return List.of(barcelona, realMadrid);
	}

}
