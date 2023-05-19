package com.example.precios.ejemplo.Entity;

import jakarta.persistence.*;

@Entity
//@Table(name = "Personas")
public class Personas{ // en la base debe estar el mismo nombre pero en minuscula

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre; //debe ser varchar o character varing

	@Column(name = "apellido")
	private Integer apellido; //debe estar con int

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getApellido() {
		return apellido;
	}

	public void setApellido(Integer apellido) {
		this.apellido = apellido;
	}
}
