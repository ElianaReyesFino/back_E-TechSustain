package com.ETechSustain.ETechSustain.Entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categoria")

public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer id_categoria;

    @Column
    private String nombre;


    public Integer getId() {
        return id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(Integer id) {
        this.id_categoria = id_categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

