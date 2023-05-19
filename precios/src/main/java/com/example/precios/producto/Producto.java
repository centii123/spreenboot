package com.example.precios.producto;

import java.math.BigDecimal;
import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data //crea automaticamente los setters y getters
@Entity //señala que es una entidad
@Table(name = "producto")
public class Producto {

    @Id //dice que es un id la de abajo
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autogenerar id
    private Long id;

    private String nombre;

    private Integer precio;
}
