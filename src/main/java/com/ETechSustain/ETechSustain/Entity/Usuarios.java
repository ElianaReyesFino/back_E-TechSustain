package com.ETechSustain.ETechSustain.Entity;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.*;

@Entity(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuarios")

public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id_usuario;

    @Column
    private String nombre;

    @Column
    private String correo;

    @Column
    private String celular;

    @Column
    private Integer rol;

    public Integer getId_usuario() {
        return id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }

    public Integer getRol() {
        return rol;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }
}