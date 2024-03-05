package com.ETechSustain.ETechSustain.Controllers;

import com.ETechSustain.ETechSustain.DTO.UsuarioDTO;
import com.ETechSustain.ETechSustain.Entity.Usuarios;
import com.ETechSustain.ETechSustain.Services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("http://127.0.0.1:5500")

public class UsuarioController {
    @Autowired
    private UsuariosService usuariosService;

    @PostMapping
    public ResponseEntity<UsuarioDTO> createUser(@RequestBody Usuarios usuariosEntity) {
        return ResponseEntity.ok(usuariosService.createUser(usuariosEntity));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> GetAllUsers() {

        return ResponseEntity.ok(usuariosService.getAllUsers());
    }

    @GetMapping("/by/{id}")
    public ResponseEntity<Optional<UsuarioDTO>> GetUser(@PathVariable Integer id) {
        return ResponseEntity.ok(usuariosService.getUserById(id));
    }

    @GetMapping("/email/{correo}")
    public ResponseEntity<Optional<UsuarioDTO>> GetUserByEmail(@PathVariable String correo) {
        return ResponseEntity.ok(usuariosService.getUserByEmail(correo));
    }

    @PutMapping("/{id}/delete")
    public String deleteUser(@PathVariable Integer id) {
        return usuariosService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<UsuarioDTO>> UpdateUser(@PathVariable Integer id, @RequestBody Usuarios newUsuariosEntity) {

        return ResponseEntity.ok(usuariosService.updateUser(id, newUsuariosEntity));

//        Optional<Usuarios> optionalUsuario = usuariosService.updateUser(id, newUsuariosEntity);
//        return optionalUsuario.orElseThrow(() -> new RuntimeException("El usuario no se puede actualizar"));
    }
}
