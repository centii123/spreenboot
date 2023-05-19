package com.example.inicio17.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "persona") //nombre de tabla
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para incrementable
    @Column(name = "id") //tipo "colum" y nombre "id"
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;


    //agregar setters y getters obligado
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
