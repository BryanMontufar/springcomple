package com.istqmet.repaso.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.istqmet.repaso.modelo.Estudiante;

public interface IEstudianteRepositorio extends JpaRepository<Estudiante, Integer>{

}
