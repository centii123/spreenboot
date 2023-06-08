package com.example.precios.EjemSnippets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class EjemService {

	@Autowired
	private EjemRepository base;

	//mostrar todos
	public ArrayList<EjemEntity> getAll(){
		return (ArrayList<EjemEntity>) this.base.findAll();
	}

	//mostrar uno
	public Optional<EjemEntity> getOne(Long id){
		return this.base.findById(id);
	}

	//guardar nuevo
	public EjemEntity save(EjemEntity persona){
		return this.base.save(persona);
	}

	//actualizar todo
	public EjemEntity put(Long id, EjemEntity personaAc){
		EjemEntity datos = this.base.findById(id).get();
		datos.setNombre(personaAc.getNombre());
		datos.setEdad(personaAc.getEdad());
		this.base.save(datos);
		return datos;
	}

	//actualizar por campos
	public EjemEntity patch(Long id, EjemEntity personaAc){
		EjemEntity datos = this.base.findById(id).get();
		datos.setNombre((personaAc.getNombre() != null) ? personaAc.getNombre() : datos.getNombre());
		datos.setEdad((personaAc.getNombre() != null) ? personaAc.getEdad() : datos.getEdad());
		this.base.save(datos);
		return datos;
	}

	//eliminar
	public String delete(Long id){
		this.base.deleteById(id);
		return "eliminado";
	}
}
