package com.example.precios.ejemplo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.precios.ejemplo.Entity.Personas;
import com.example.precios.ejemplo.Repository.BaseConect;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class Hola {

	@Autowired
	private BaseConect base;

	public ArrayList<Personas> hola(){
		return (ArrayList<Personas>) this.base.findAll();
	}

	public Personas posttt(Personas persona){
		return this.base.save(persona);
	}

	public Optional<Personas> uno(Long id){
		return this.base.findById(id);
	}

	public Personas actualizar(Long id, Personas personaAc){
		Personas datos = this.base.findById(id).get();
		datos.setNombre(personaAc.getNombre());
		datos.setApellido(personaAc.getApellido());
		this.base.save(datos);
		return datos;
	}

	public String borrar(Long id){
		this.base.deleteById(id);
		return "eliminado";
	}
}
