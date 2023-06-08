package com.example.precios.EjemSnippets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class EjemController {

	@Autowired
	public EjemService service;

	//obtener todos
	@GetMapping("")
	public List<EjemEntity> getAll(){ //List o ArrayList es lo mismo
		return this.service.getAll();
	}

	//obtener uno
	@GetMapping("{id}")
	public Optional<EjemEntity> getOne(@PathVariable("id") Long id){
		return this.service.getOne(id);
	}

	//agregar
	@PostMapping("")
	public EjemEntity save(@RequestBody EjemEntity body){ //post
		return this.service.save(body);
	}

	//actualizar campo completo el id va en el body
	@PutMapping("/")
    public EjemEntity update(@RequestBody EjemEntity entity){
        return this.service.save(entity);
    }

	//actualizar campo completo el id va en la url
	@PutMapping("/{id}")
	public EjemEntity put( @RequestBody EjemEntity per, @PathVariable("id") Long id){
		return this.service.put(id,per);
	}

	//actualizar por campos
	@PatchMapping("/{id}")
	public EjemEntity patch( @RequestBody EjemEntity per, @PathVariable("id") Long id){
		return this.service.patch(id,per);
	}

	//eliminar
	@DeleteMapping("{id}")
	public String delete(@PathVariable("id") Long id){
		return this.service.delete(id);
	}
}

// al usar @RequestParam se auto configura sea string o integer
	/*@GetMapping("param")
	public String para(@RequestParam("nombre") String nombre){
		return nombre + 1;
		//http://localhost:3000/param?nombre=sebas  imprime sebas
	}

	@GetMapping("param2")
	public Integer para(@RequestParam("num") Integer num){
		return num + 1;
		//http://localhost:3000/param2?num=2  imprime 3
	}*/