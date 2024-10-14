package com.istqmet.repaso.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.istqmet.repaso.modelo.Curso;
import com.istqmet.repaso.repositorio.ICursoRepositorio;
import com.istqmet.repaso.servicio.ICursoServicio;

@Service
@Component
public class CursoServicioImpl implements ICursoServicio{
	
	@Autowired
	private ICursoRepositorio insertarCurso;
	@Override
	public void insertarCurso(Curso nuevo) {
		// TODO Auto-generated method stub
		
		insertarCurso.save(nuevo);
		
	}

}
