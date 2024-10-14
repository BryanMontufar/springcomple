package com.istqmet.repaso.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteControlador {
	@GetMapping("/Estudiante")
	public String paginaEstudiente() {
		return "/Aula/listarEstudiante";
	}

}
