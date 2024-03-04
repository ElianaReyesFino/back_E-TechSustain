package com.ETechSustain.ETechSustain.Controllers;

import com.ETechSustain.ETechSustain.Entity.Usuarios;
import com.ETechSustain.ETechSustain.Services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
//@CrossOrigin("")

public class UsuarioController {
    @Autowired
    private UsuariosService usuariosService;

    @PostMapping
    public Usuarios createUser(@RequestBody Usuarios usuariosEntity) {
        return usuariosService.createUser(usuariosEntity);
    }

    @GetMapping
    public List<Usuarios> GetAllUsers() {
        return usuariosService.getAllUsers();
    }

    @GetMapping("/by/{id}")
    public Optional<Usuarios> GetUser(@PathVariable Integer id) {
        return usuariosService.getUserById(id);
    }

    @GetMapping("/email/{correo}")
    public Optional<Usuarios> GetUserByEmail(@PathVariable String correo) {
        return usuariosService.getUserByEmail(correo);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {
        return usuariosService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public Usuarios UpdateUser(@PathVariable Integer id, @RequestBody Usuarios newUsuariosEntity) {
        Optional<Usuarios> optionalUsuario = usuariosService.updateUser(id, newUsuariosEntity);
        return optionalUsuario.orElseThrow(() -> new RuntimeException("El usuario no se puede actualizar"));
    }
}
