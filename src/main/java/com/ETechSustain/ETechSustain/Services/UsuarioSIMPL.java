package com.ETechSustain.ETechSustain.Services;

import com.ETechSustain.ETechSustain.Entity.Usuarios;
import com.ETechSustain.ETechSustain.Repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioSIMPL implements UsuariosService{

    @Autowired
    private UsuariosRepository usuariosRepository;


    @Override
    public Usuarios createUser(Usuarios usuarios) {
        return usuariosRepository.save(usuarios);
    }

    @Override
    public List<Usuarios> getAllUsers() {
        return usuariosRepository.findAll();
    }


    @Override
    public Optional<Usuarios> getUserById(Integer id) {
        try {
            return usuariosRepository.findById(id);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    public Optional<Usuarios> getUserByEmail(String correo) {
        return usuariosRepository.findByCorreo(correo);
    }

    @Override
    public Optional<Usuarios> updateUser(Integer id, Usuarios newUsuarios) {
        Usuarios usuarioBuscado = usuariosRepository.findById(id).orElse(null);
        if (usuarioBuscado != null){
            usuarioBuscado.setNombre(newUsuarios.getNombre());
            usuarioBuscado.setCorreo(newUsuarios.getCorreo());
            usuarioBuscado.setCelular(newUsuarios.getCelular());
            usuarioBuscado.setRol(newUsuarios.isRol());
            return Optional.of(usuariosRepository.save(usuarioBuscado));
        }
        else {
            throw new RuntimeException("El usuario no se puede actualizar");
        }
    }

    @Override
    public String deleteUser(Integer id) {
        usuariosRepository.deleteById(id);
        return "El usuario fue eliminado";
    }
}
