package com.ETechSustain.ETechSustain.Services;

import com.ETechSustain.ETechSustain.Entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {

    public List<Categoria> getAllCategorias();

    public Categoria createCategoria(Categoria categoria);

    public String deleteCategoria(Integer id);

    public Optional<Categoria> updateCategoria(Integer id, Categoria newCategoria);
}
