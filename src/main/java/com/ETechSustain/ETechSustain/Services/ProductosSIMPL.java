package com.ETechSustain.ETechSustain.Services;

import com.ETechSustain.ETechSustain.Entity.Productos;
import com.ETechSustain.ETechSustain.Repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosSIMPL implements ProductoService {

    @Autowired
    private ProductosRepository productosRepository;


    @Override
    public List<Productos> getAllProducts() {
        return productosRepository.findAll();
    }


    @Override
    public Productos createProduct(Productos productos) {
        return productosRepository.save(productos);
    }


    @Override
    public String deleteProduct(Integer id) {
        productosRepository.deleteById(Long.valueOf(id));
        return "El producto fue eliminado con exito";
    }


    @Override
    public Optional<Productos> updateProduct(Integer id, Productos newProduct) {
        Productos productoBuscado = productosRepository.findById(Long.valueOf(id)).orElse(null);
        if (productoBuscado != null){
            productoBuscado.setNombre(newProduct.getNombre());
            productoBuscado.setDescripcion(newProduct.getDescripcion());
            productoBuscado.setPrecio(newProduct.getPrecio());
            productoBuscado.setCantidad(newProduct.getCantidad());
            productoBuscado.setUrl_image(newProduct.getUrl_image());
            //productoBuscado.setId_categoria(newProduct.getId_categoria());

            return Optional.of(productosRepository.save(productoBuscado));
        }
        else {
            throw new RuntimeException("El producto no se puede actualizar");
        }
    }

    @Override
    public List<Productos> createProducts(List<Productos> productos) {
        return productosRepository.saveAll(productos);
    }
}
