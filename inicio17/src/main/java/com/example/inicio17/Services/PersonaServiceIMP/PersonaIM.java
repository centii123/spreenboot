package com.example.inicio17.Services.PersonaServiceIMP;

import com.example.inicio17.Entity.Persona;
import com.example.inicio17.Repository.PersonaRepo;
import com.example.inicio17.Services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  //esta es de tipo service
public class PersonaIM implements PersonaService { //implementamos los metodos de una interfase a esta clase
    @Autowired // esto es para que lo tome de clase importante
    private PersonaRepo repo;

    @Override // indica que es una implementacion de una interfase
    public List<Persona> ConsultarPersona() {
        return (List<Persona>) this.repo.findAll();
    }

    @Override
    public Persona CrearPersona(Persona per) {

        return null;
    }

    @Override
    public Persona ModificarPersona(Persona per) {
        return null;
    }

    @Override
    public Persona BuscarPersona(int id) {
        return null;
    }

    @Override
    public void EliminarPersona(int id) {

    }
}
