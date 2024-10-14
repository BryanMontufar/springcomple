package com.istqmet.repaso.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.istqmet.repaso.modelo.Matricula;
import com.istqmet.repaso.repositorio.IMatriculaRepositorio;
import com.istqmet.repaso.servicio.IMatriculaServicio;

@Service
@Component
public class MatriculaServicioImpl implements IMatriculaServicio{
	@Autowired
	private IMatriculaRepositorio insertarMatricula;
	@Override
	public void insertarMatricula(Matricula nuevo) {
		// TODO Auto-generated method stub
		
		insertarMatricula.save(nuevo);
	}

}
