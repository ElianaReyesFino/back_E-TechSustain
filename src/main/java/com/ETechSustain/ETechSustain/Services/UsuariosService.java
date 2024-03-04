package com.ETechSustain.ETechSustain.Services;

import com.ETechSustain.ETechSustain.Entity.Usuarios;

import java.util.List;
import java.util.Optional;

public interface UsuariosService {
    public Usuarios createUser(Usuarios usuarios);
    public List<Usuarios> getAllUsers();

    public Optional<Usuarios> getUserById(Integer id);
    public Optional<Usuarios> getUserByEmail(String correo);
    public Optional<Usuarios> updateUser(Integer id, Usuarios newUsuarios);
    public String deleteUser(Integer id);
}
