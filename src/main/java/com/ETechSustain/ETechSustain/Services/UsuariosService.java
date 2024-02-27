package com.ETechSustain.ETechSustain.Services;

import com.ETechSustain.ETechSustain.Entity.Usuarios;

import java.util.List;
import java.util.Optional;

public interface UsuariosService {
    public Usuarios createUser(Usuarios usuarios);
    public List<Usuarios> getAllUsers();
    public Optional<Usuarios> updateUser(Usuarios newUsuarios);
    public void deleteUser(Integer id);
}
