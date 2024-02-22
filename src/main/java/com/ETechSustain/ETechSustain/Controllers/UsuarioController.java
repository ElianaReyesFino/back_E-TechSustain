package com.ETechSustain.ETechSustain.Controllers;

import com.ETechSustain.ETechSustain.Entity.Usuarios;
import com.ETechSustain.ETechSustain.Repository.UsuariosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {
    private UsuariosRepository usuariosRepository;

    public UsuarioController(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    @PostMapping
    public Usuarios createUser(@RequestBody Usuarios usuarios){
        return usuariosRepository.save(usuarios);
    }

    @GetMapping
    public List<Usuarios> GetAllUsers(){
        return usuariosRepository.findAll();
    }

    @PutMapping("/{id}")
    public Usuarios UpdateUser(@PathVariable Long id , @RequestBody Usuarios newUsuarios) {
        Usuarios usuarioBuscado = usuariosRepository.findById(id).orElse(null);
        if (usuarioBuscado != null){
            usuarioBuscado.setNombre(newUsuarios.getNombre());
            usuarioBuscado.setEmail(newUsuarios.getEmail());
            usuarioBuscado.setTelefono(newUsuarios.getTelefono());
            usuarioBuscado.setRol(newUsuarios.getRol());
            return usuariosRepository.save(usuarioBuscado);
        }
        else {
            throw new RuntimeException("El usuario no se puede actualizar");
        }
    }

    @DeleteMapping("/{id}")
    public String deleteUser (@PathVariable Long id){
        if(usuariosRepository.findById(id).isPresent()){
            usuariosRepository.deleteById(id);
            return "El usuario fue eliminado";
        }
        else {
            throw new RuntimeException("El usuario no se puede eliminar");
        }
    }
}
