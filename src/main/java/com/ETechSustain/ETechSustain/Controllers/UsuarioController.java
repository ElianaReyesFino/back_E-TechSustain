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
    public Usuarios createProduct(@RequestBody Usuarios usuariosEntity){
        return usuariosRepository.save(usuariosEntity);
    }


    @GetMapping
    public List<Usuarios> GetAllUsers(){
        return usuariosRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public String deleteProduct (@PathVariable Integer id){
        if(usuariosRepository.findById(id).isPresent()){
            usuariosRepository.deleteById(id);
            return "El usuario fue eliminado";
        }
        else {
            throw new RuntimeException("El usuario no se puede eliminar");
        }
    }

    @PutMapping("/{id}")
    public Usuarios UpdateProduct(@PathVariable Integer id , @RequestBody Usuarios newUsuariosEntity) {
        Usuarios usuarioBuscado = usuariosRepository.findById(id).orElse(null);
        if (usuarioBuscado != null){
            usuarioBuscado.setNombre(newUsuariosEntity.getNombre());
            usuarioBuscado.setCorreo(newUsuariosEntity.getCorreo());
            usuarioBuscado.setCelular(newUsuariosEntity.getCelular());
            usuarioBuscado.setRol(newUsuariosEntity.getRol());
            return usuariosRepository.save(usuarioBuscado);
        }
        else {
            throw new RuntimeException("El usuario no se puede actualizar");
        }
    }
}
