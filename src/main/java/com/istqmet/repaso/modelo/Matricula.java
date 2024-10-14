package com.istqmet.repaso.modelo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data 
@Entity
public class Matricula implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMatricula;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "fkMatricula")
	private Estudiante fkMatricula; 
}
