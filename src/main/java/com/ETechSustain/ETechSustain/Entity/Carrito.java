package com.ETechSustain.ETechSustain.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "carrito")

public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrito")
    private Integer id_carrito;

    @Column
    private Integer id_usuario;

    @Column
    private Integer id_producto;

    @Column
    private int cantidad;

    @Column
    private double precioTotal;

    public Integer getId() {
        return id_carrito;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setId(Integer id) {
        this.id_carrito = id_carrito;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}