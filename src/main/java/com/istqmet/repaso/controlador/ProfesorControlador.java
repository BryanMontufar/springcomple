package com.istqmet.repaso.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfesorControlador {
	@GetMapping("/Profesor")
	public String paginaProfesor() {
		return "/Aula/listarProfesor";
	}

}
