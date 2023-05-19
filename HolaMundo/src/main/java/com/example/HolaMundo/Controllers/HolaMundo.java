package com.example.HolaMundo.Controllers;

import com.example.HolaMundo.Entity.Personas;
import com.example.HolaMundo.Services.Hola;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class HolaMundo {

	@Autowired
	public Hola saludo;

	@GetMapping("/")
	public String inicio(){
		return "Bienvenido";
	}

	@GetMapping("/hola")
	public List<Personas> Hola(){ //List o ArrayList es lo mismo
		return this.saludo.hola();
	}

	@PostMapping //@PostMapping("/mama") cualquiera de los 2 usar
	public Personas postt(@RequestBody Personas body){ //post
		return this.saludo.posttt(body);
	}

	@GetMapping("/{id}")
	public Optional<Personas> unp(@PathVariable("id") Long id){
		return this.saludo.uno(id);
	}
	// al usar @RequestParam se auto configura sea string o integer
	@GetMapping("/param")
	public String para(@RequestParam("nombre") String nombre){
		return nombre + 1;
		//http://localhost:3000/param?nombre=sebas  imprime sebas
	}

	@GetMapping("/param2")
	public Integer para(@RequestParam("num") Integer num){
		return num + 1;
		//http://localhost:3000/param2?num=2  imprime 3
	}

	@PutMapping("/{id}")
	public Personas actualizar( @RequestBody Personas per, @PathVariable("id") Long id){
		return this.saludo.actualizar(id,per);
	}

	@DeleteMapping("/{il}")
	public String eliminar(@PathVariable("il") Long id){
		return this.saludo.borrar(id);
	}
}
