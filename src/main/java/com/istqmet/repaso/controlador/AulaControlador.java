package com.istqmet.repaso.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.istqmet.repaso.modelo.Aula;
import com.istqmet.repaso.servicio.IAulaServicio;


@Controller
public class AulaControlador {
	
	@Autowired
	private IAulaServicio servicioAula;
	
	@GetMapping("/listaAula")
	public String paginaAula(Model model) {
		
		List<Aula> datosAula = servicioAula.listar();
		model.addAttribute("listaAu", datosAula);
		return "/Aula/listarAulas";
	}
	
	@GetMapping("/nuevo-Aula") 
	public String paginaCrearAula() {
		return "/Aula/NuevaAula";
	}
}
