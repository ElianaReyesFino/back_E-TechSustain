package com.ETechSustain.ETechSustain.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "productos")

public class Productos {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String descripcion;

    private double precio;

    private int cantidad;

    private String url_image;

    private Long id_categoria;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getUrlImage() {
        return url_image;
    }

    public Long getId_categoria() {
        return id_categoria;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public void setUrlImage(String urlImage) {
        this.url_image = urlImage;
    }

    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

    @Override
    public String toString() {
        return "productos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio='" + precio + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", url_image='" + url_image + '\'' +
                ", id_categoria='" + id_categoria + '\'' +
                '}';
    }
}