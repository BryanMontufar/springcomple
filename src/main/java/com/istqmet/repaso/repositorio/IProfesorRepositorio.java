package com.istqmet.repaso.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.istqmet.repaso.modelo.Profesor;

public interface IProfesorRepositorio extends JpaRepository<Profesor, Integer> {

}
