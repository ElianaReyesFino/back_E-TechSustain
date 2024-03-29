package com.ETechSustain.ETechSustain.Converter;

import com.ETechSustain.ETechSustain.Entity.Usuarios;
import com.ETechSustain.ETechSustain.DTO.UsuarioDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;


@Component
@Builder
@AllArgsConstructor
public class UsuarioToUsuarioDTOCoverter implements Converter<Usuarios, UsuarioDTO> {

    @Override
    public UsuarioDTO convert(Usuarios source) {
        return UsuarioDTO.builder()
                .id(source.getId())
                .nombre(source.getNombre())
                .correo(source.getCorreo())
                .celular(source.getCelular())
                .rol(source.getRol())
                .created_at(source.getCreated_at())
                .build();
    }
}
