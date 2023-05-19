package com.example.precios.producto;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository repository;

    //Create
    //delimitador de acceso
    public Producto save(Producto entity){
       return repository.save(entity);
    }

    public void delete(long id){
        repository.deleteById(id);
    }

    public ArrayList<Producto> findall(){
        return (ArrayList<Producto>) repository.findAll();
    }
}
