package com.istqmet.repaso.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexControlador {
	@GetMapping("/inicio")
	public String paginaInicio() {
		return "index";
	}
	

}
