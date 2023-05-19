package com.example.inicio17.Services;

import com.example.inicio17.Entity.Persona;

import java.util.List;

public interface PersonaService {

    // es una lista ya que es una consulta que puede traer varios objetos
    public List<Persona> ConsultarPersona(); //ojo todos son funciones

    // No es una lista ya que solo crea un objeto
    public Persona CrearPersona(Persona per); // los parametros seran de tipo Persona y per es el nombre de la variable

    public Persona ModificarPersona(Persona per);

    public Persona BuscarPersona(int id);
    public void EliminarPersona(int id);// es void porque no devuelve nada
}
