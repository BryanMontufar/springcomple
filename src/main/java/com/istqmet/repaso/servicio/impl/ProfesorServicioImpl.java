package com.istqmet.repaso.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.istqmet.repaso.modelo.Profesor;
import com.istqmet.repaso.repositorio.IProfesorRepositorio;
import com.istqmet.repaso.servicio.IProfesorServicio;

@Service
@Component
public class ProfesorServicioImpl implements IProfesorServicio {
	
	@Autowired
	private IProfesorRepositorio insertarProfesor;
	@Override
	public void insertarProfesor(Profesor nuevo) {
		// TODO Auto-generated method stub
		
		insertarProfesor.save(nuevo);
		
	}

}
