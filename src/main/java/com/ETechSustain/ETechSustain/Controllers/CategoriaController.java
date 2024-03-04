package com.ETechSustain.ETechSustain.Controllers;

import com.ETechSustain.ETechSustain.Entity.Categoria;
import com.ETechSustain.ETechSustain.Services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
//@CrossOrigin("")

public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;


    @GetMapping
    public List<Categoria> getAllCategorias(){
        return categoriaService.getAllCategorias();
    }

    @PostMapping
    public Categoria createCategoria(@RequestBody Categoria categoria){
        return categoriaService.createCategoria(categoria);
    }

    @DeleteMapping("/{id}")
    public String deleteCategoria(@PathVariable Integer id){
        return categoriaService.deleteCategoria(id);
    }

    @PutMapping("/{id}")
    public Optional<Categoria> updateCategoria(@PathVariable Integer id, @RequestBody Categoria new_categoria){
        return categoriaService.updateCategoria(id, new_categoria);
    }

}
