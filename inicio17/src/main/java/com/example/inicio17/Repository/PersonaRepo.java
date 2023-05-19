package com.example.inicio17.Repository;

import com.example.inicio17.Entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepo extends CrudRepository<Persona, Integer> {
    //Persona es el objeto clase que se aplicara los metodos
    //Integer es el atributo que quiere que se base que es el ID de la Entidad persona

}
