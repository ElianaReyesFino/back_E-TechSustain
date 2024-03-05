package com.ETechSustain.ETechSustain.Services;

import com.ETechSustain.ETechSustain.DTO.UsuarioDTO;
import com.ETechSustain.ETechSustain.Entity.Usuarios;

import java.util.List;
import java.util.Optional;

public interface UsuariosService {
    public UsuarioDTO createUser(Usuarios usuarios);
    public List<UsuarioDTO> getAllUsers();

    public Optional<UsuarioDTO> getUserById(Integer id);
    public Optional<UsuarioDTO> getUserByEmail(String correo);
    public Optional<UsuarioDTO> updateUser(Integer id, Usuarios newUsuarios);
    public String deleteUser(Integer id);

    //Verifide if user exist and correo and contraseña are correct
    public Optional<UsuarioDTO> verifyUser(String correo, String contrasena);
}
