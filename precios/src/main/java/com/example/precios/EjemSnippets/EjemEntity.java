package com.example.precios.EjemSnippets;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
//@Table(name = "EjemEntity") (opcional)
public class EjemEntity{ // en la base debe estar el mismo nombre pero en minuscula

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre; //debe ser varchar o character varing en la base de datos

	@Column(name = "edad")
	private Integer edad; //debe ser int en la base de datos
}
