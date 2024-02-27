package com.ETechSustain.ETechSustain.Services;

import com.ETechSustain.ETechSustain.Entity.Usuarios;

import java.util.List;
import java.util.Optional;

public class UsuarioSIMPL implements UsuariosService{

    @Override
    public void deleteUser(Integer id) {
        System.out.println("Se elimino el usuario");
    }

    @Override
    public Optional<Usuarios> updateUser(Usuarios newUsuarios) {
        return null;
    }

    @Override
    public List<Usuarios> getAllUsers() {
        return null;
    }

    @Override
    public Usuarios createUser(Usuarios usuarios) {
        return null;
    }
}
