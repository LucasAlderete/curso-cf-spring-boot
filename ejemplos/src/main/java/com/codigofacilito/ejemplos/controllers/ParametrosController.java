package com.codigofacilito.ejemplos.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.codigofacilito.ejemplos.models.Equipo;
import com.codigofacilito.ejemplos.models.Jugador;
import com.codigofacilito.ejemplos.services.IService;

@Controller
public class ParametrosController {
	
	private IService equipoService;
	
	public ParametrosController(@Qualifier("equiposEspaña") IService equipoService) {
		this.equipoService = equipoService;
	}

	@GetMapping("/parametros")
	public String parametros(@RequestParam(defaultValue = "") String valor,
			@RequestParam(defaultValue = "", name = "valor_dos") String otroValor, Model model) {

		model.addAttribute("titulo", "Parametros");
		model.addAttribute("parametro", valor);
		model.addAttribute("otroValor", otroValor);

		return "parametros";
	}


	@GetMapping("/equipos/{nombre}/{numero}")
	public String parametrosPorPath(@PathVariable String nombre, @PathVariable("numero") Integer numero, Model model) {

		Optional<Equipo> equipoOptional = equipoService.getTodos().stream()
				.filter(equipo -> nombre.toLowerCase().equals(equipo.getNombre().toLowerCase())).findFirst();

		if (equipoOptional.isPresent()) {
			Optional<Jugador> jugadorOptional = equipoOptional.get().getPlantilla().stream()
					.filter(jugador -> numero == jugador.getNumero()).findFirst();

			if (jugadorOptional.isPresent()) {
				model.addAttribute("jugador", jugadorOptional.get());
			}
		}

		return "parametros";
	}

}
