package com.example.inicio17.Controller;


import com.example.inicio17.Entity.Persona;
import com.example.inicio17.Services.PersonaServiceIMP.PersonaIM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user") //donde pertenece http://localhost:20200/user
public class ControladorPersona {

    @Autowired
    private PersonaIM impl;

    @GetMapping
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPersonas(){ // el ? es para que me debuleva cualquier cosa
        List<Persona> listaPersona=this.impl.ConsultarPersona();
        return ResponseEntity.ok(listaPersona);
    }
}
