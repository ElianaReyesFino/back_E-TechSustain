package com.ETechSustain.ETechSustain.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "carrito")

public class Carrito {

    @Id
    @GeneratedValue
    private Long id;

    private Long id_usuario;

    private Long id_producto;

    private int cantidad;

    private double precioTotal;

    public Long getId() {
        return id;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}