package com.ETechSustain.ETechSustain.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {

    private Integer id;
    private String nombre;
    private String correo;
    private String celular;
    private boolean rol;
    private Date created_at;
}
