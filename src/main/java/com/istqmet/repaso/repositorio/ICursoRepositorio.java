package com.istqmet.repaso.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.istqmet.repaso.modelo.Curso;

public interface ICursoRepositorio extends JpaRepository<Curso, Integer>{

}
