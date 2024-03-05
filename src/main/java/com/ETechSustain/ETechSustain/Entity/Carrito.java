package com.ETechSustain.ETechSustain.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "carrito")

public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrito")
    private Integer id_carrito;

    @Column(name = "id_usuario", insertable = false, updatable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuarios usuario;

//    @Column
//    private Integer id_producto;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Productos producto;

    @Column
    private Integer cantidad;

    @Column
    private double precio_total;
}