package com.istqmet.repaso.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatriculaControlador {
	@GetMapping("/Matricula")
	public String paginaMatricula() {
		return "/Aula/listarMatricula";
	}


}
