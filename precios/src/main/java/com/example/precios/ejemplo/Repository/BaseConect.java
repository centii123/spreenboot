package com.example.precios.ejemplo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.precios.ejemplo.Entity.Personas;

//tambien se puede usar JpaRepository es mejor por unas funciones extras pero trabajan igual
public interface BaseConect extends CrudRepository<Personas, Long> {
    //Persona es el objeto clase que se aplicara los metodos
    //Long es el atributo que quiere que se base que es el ID de la Entidad persona
}
