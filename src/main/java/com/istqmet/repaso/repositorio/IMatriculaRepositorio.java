package com.istqmet.repaso.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.istqmet.repaso.modelo.Matricula;

public interface IMatriculaRepositorio extends JpaRepository<Matricula, Integer> {

}
