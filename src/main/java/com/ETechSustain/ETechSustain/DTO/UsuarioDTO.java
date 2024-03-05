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
    private String name;
    private String email;
    private String celular;
    private boolean role;
    private Date created_at;
}
