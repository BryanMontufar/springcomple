package com.istqmet.repaso.servicio;

import java.util.List;

import com.istqmet.repaso.modelo.Aula;

public interface IAulaServicio {
	
	public void insertarAula(Aula nuevo);
	public void actualizarAula(Aula elimina);
	public  List<Aula> listar();
	public Aula listarAula(int id);
	public void eliminarAula(int id);
	public List<Aula> listarAulaActivo();
}
