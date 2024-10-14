package com.istqmet.repaso.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.istqmet.repaso.modelo.Estudiante;
import com.istqmet.repaso.repositorio.IEstudianteRepositorio;
import com.istqmet.repaso.servicio.IEstudianteServicio;

@Service
@Component
public class EstudianteServicioImpl implements IEstudianteServicio{
	
	@Autowired
	private IEstudianteRepositorio insertarEstudiante;
	@Override
	public void insertarEstudiante(Estudiante nuevo) {
		// TODO Auto-generated method stub
		
		insertarEstudiante.save(nuevo);
		
	}
	
	

}
