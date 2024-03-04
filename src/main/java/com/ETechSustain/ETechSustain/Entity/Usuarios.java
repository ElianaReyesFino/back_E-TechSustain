package com.ETechSustain.ETechSustain.Entity;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.*;

@Entity(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "usuarios")

public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;

    @Column
    private String nombre;

    @Column
    private String correo;

    @Column
    private String celular;

    @Column
    private boolean rol;
}