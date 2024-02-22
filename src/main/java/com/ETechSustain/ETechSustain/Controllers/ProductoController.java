package com.ETechSustain.ETechSustain.Controllers;

import com.ETechSustain.ETechSustain.Entity.Productos;
import com.ETechSustain.ETechSustain.Repository.ProductosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")

public class ProductoController {

    private ProductosRepository productosRepository;

    public ProductoController(ProductosRepository productosRepository) {
        this.productosRepository = productosRepository;
    }

    @PostMapping
    public Productos createProduct(@RequestBody Productos productosEntity){
        return productosRepository.save(productosEntity);
    }

    @GetMapping
    public List<Productos> GetAllProducts(){
        return productosRepository.findAll();
    }

    @PutMapping("/{id}")
    public Productos UpdateProduct(@PathVariable Long id , @RequestBody Productos newProductosEntity) {

        Productos productoBuscado = productosRepository.findById(id).orElse(null);

        if (productoBuscado != null){
            productoBuscado.setNombre(newProductosEntity.getNombre());
            productoBuscado.setDescripcion(newProductosEntity.getDescripcion());
            productoBuscado.setPrecio(newProductosEntity.getPrecio());
            productoBuscado.setCantidad(newProductosEntity.getCantidad());
            productoBuscado.setUrlImage(newProductosEntity.getUrlImage());
            productoBuscado.setId_categoria(newProductosEntity.getId_categoria());

            return productosRepository.save(productoBuscado);
        }
        else {
            throw new RuntimeException("El producto no se puede actualizar");
        }
    }

    @DeleteMapping("/{id}")
    public String deleteProduct (@PathVariable Long id){

        if(productosRepository.findById(id).isPresent()){
            productosRepository.deleteById(id);
            return "El producto fue eliminado";
        }
        else {
            throw new RuntimeException("El producto no se puede eliminar");
        }
    }
}
