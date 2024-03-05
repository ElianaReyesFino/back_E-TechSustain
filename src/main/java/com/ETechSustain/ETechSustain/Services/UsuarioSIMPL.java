package com.ETechSustain.ETechSustain.Services;

import com.ETechSustain.ETechSustain.DTO.UsuarioDTO;
import com.ETechSustain.ETechSustain.Entity.Usuarios;
import com.ETechSustain.ETechSustain.Repository.UsuariosRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UsuarioSIMPL implements UsuariosService{

    @Autowired
    private final UsuariosRepository usuariosRepository;

    @Autowired
    private final ConversionService conversionService;

    @Override
    public UsuarioDTO createUser(Usuarios usuarios) {
        Optional<Usuarios> existingUsuario = usuariosRepository.findByCorreo(usuarios.getCorreo());
        if (existingUsuario.isPresent()) {
            throw new RuntimeException("Email already in use");
        } else {
            usuariosRepository.save(usuarios); // Save the new user
            return conversionService.convert(usuarios, UsuarioDTO.class);
        }
    }

    @Override
    public List<UsuarioDTO> getAllUsers() {
        List<Usuarios> usuarios = usuariosRepository.findAllActiveUsers();
        if (!usuarios.isEmpty()) {
            return usuarios.stream()
                    .map(usuario -> conversionService.convert(usuario, UsuarioDTO.class))
                    .collect(Collectors.toList());
        } else {
            throw new RuntimeException("No existen usuarios registrados");
        }
    }

    @Override
    public Optional<UsuarioDTO> getUserById(Integer id) {
        Optional<Usuarios> usuarioBuscado = usuariosRepository.findById(id);
        if (usuarioBuscado.isPresent()) {
            return usuarioBuscado.map(usuario -> conversionService.convert(usuario, UsuarioDTO.class));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<UsuarioDTO> getUserByEmail(String correo) {
        Optional<Usuarios> usuarioBuscado = usuariosRepository.findByCorreo(correo);
        if (usuarioBuscado.isPresent()) {
            return usuarioBuscado.map(usuario -> conversionService.convert(usuario, UsuarioDTO.class));
        } else {
            return Optional.empty();
        }
        //return usuariosRepository.findByCorreo(correo);
    }

    @Override
    public Optional<UsuarioDTO> updateUser(Integer id, Usuarios newUsuarios) {
        Usuarios usuarioBuscado = usuariosRepository.findById(id).orElse(null);
        if (usuarioBuscado != null){
            usuarioBuscado.setNombre(newUsuarios.getNombre());
            usuarioBuscado.setCorreo(newUsuarios.getCorreo());
            usuarioBuscado.setCelular(newUsuarios.getCelular());
            usuarioBuscado.setRol(newUsuarios.getRol());
            usuarioBuscado.setContrasena(newUsuarios.getContrasena());

            return Optional.of(conversionService.convert(usuariosRepository.save(usuarioBuscado), UsuarioDTO.class));
        }
        else {
            throw new RuntimeException("El usuario no se puede actualizar");
        }
    }

    @Override
    public String deleteUser(Integer id) {
        Optional<Usuarios> optionalUsuario = usuariosRepository.findById(id);
        if (optionalUsuario.isPresent()) {
            Usuarios usuario = optionalUsuario.get();
            usuario.setDeleted_at(new Date()); // Set the deleted_at field to the current timestamp
            usuariosRepository.save(usuario); // Save the updated entity
            return "El usuario fue marcado como eliminado";
        } else {
            return "El usuario no pudo ser encontrado";
        }
    }
}
