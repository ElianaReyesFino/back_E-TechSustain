package com.ETechSustain.ETechSustain.Services;

import com.ETechSustain.ETechSustain.Entity.Categoria;
import com.ETechSustain.ETechSustain.Repository.CategoriaRespository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaSIMPL implements CategoriaService {

    @Autowired
    private CategoriaRespository categoriaRepository;


    @Override
    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria createCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public String deleteCategoria(Integer id) {
        categoriaRepository.deleteById(Long.valueOf(id));
        return "La categoria fue eliminada con exito";
    }

    @Override
    public Optional<Categoria> updateCategoria(Integer id, Categoria newCategoria) {
        Categoria categoriaBuscado = categoriaRepository.findById(Long.valueOf(id)).orElse(null);
        if (categoriaBuscado != null){
            categoriaBuscado.setNombre(newCategoria.getNombre());
            return Optional.of(categoriaRepository.save(categoriaBuscado));
        }
        else {
            throw new RuntimeException("La categoria no se puede actualizar");
        }
    }
}


