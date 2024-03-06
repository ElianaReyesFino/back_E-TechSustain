package com.ETechSustain.ETechSustain.Services;

import com.ETechSustain.ETechSustain.Entity.Productos;
import java.util.List;
import java.util.Optional;

public interface ProductoService {

    public List<Productos> getAllProducts();

    public Productos createProduct(Productos productos);

    public String deleteProduct(Integer id);

    public Optional<Productos> updateProduct(Integer id, Productos newProduct);

    public List<Productos> createProducts(List<Productos> productos);
}
