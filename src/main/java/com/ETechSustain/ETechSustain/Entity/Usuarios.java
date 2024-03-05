package com.ETechSustain.ETechSustain.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

@Entity(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "usuarios")
@DynamicUpdate
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
    private String contrasena;

    @Column
    private String celular;

    @Column(columnDefinition = "boolean default false")
    private Boolean rol;

    @CreationTimestamp
    @Column(nullable = false)
    private Date created_at;

    @Column(name= "deleted_at", nullable = true)
    private Date deleted_at;
}