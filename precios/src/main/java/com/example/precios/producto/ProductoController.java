package com.example.precios.producto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
@CrossOrigin({"*"}) //asegurar el acceso para que no todos entren se pone las ips que queremos q ingresen
public class ProductoController {
    
    @Autowired
    ProductoService productoService;

    @GetMapping("/a")
    public String hola(){
        return "hola mundo";
    }

    @GetMapping("")
    public ArrayList<Producto> findAll(){
        return productoService.findall();
    }


    @PostMapping("")
    public Producto save(@RequestBody Producto entity){
        return productoService.save(entity);
    }

    @PutMapping("/{id}")
    public Producto update(@RequestBody Producto entity){
        return productoService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void delete(@PathVariable long id){
        productoService.delete(id);
    }

}
