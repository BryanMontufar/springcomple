package com.istqmet.repaso;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.istqmet.repaso.modelo.Profesor;
import com.istqmet.repaso.servicio.IProfesorServicio;

@SpringBootTest
class RepasoApplicationTests {
	
	@Autowired
	private IProfesorServicio servicioProfesor;

	@Test
	void contextLoads() {
		
		Profesor nuevo = new Profesor();
		nuevo.setNombreProfesor("Bryan");
		nuevo.setDireccion("Recreo");
		servicioProfesor.insertarProfesor(nuevo);
	}
}
