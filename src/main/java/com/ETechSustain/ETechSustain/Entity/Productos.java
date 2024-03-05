package com.ETechSustain.ETechSustain.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "productos")

public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer id_producto;

    @Column
    private String nombre;

    @Column(length = 2000)
    private String descripcion;

    @Column
    private double precio;

    @Column
    private Integer cantidad;

    @Column(columnDefinition = "TEXT")
    private String url_image;
//    @Column
//    private Integer id_categoria;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

}