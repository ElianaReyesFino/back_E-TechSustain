package com.ETechSustain.ETechSustain.Controllers;

import com.ETechSustain.ETechSustain.Entity.Productos;
import com.ETechSustain.ETechSustain.Repository.ProductosRepository;
import com.ETechSustain.ETechSustain.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
@CrossOrigin("http://127.0.0.1:5500")

public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Productos> getAllProducts(){
        return productoService.getAllProducts();
    }


    @PostMapping
    public Productos createProduct(@RequestBody Productos productos){
        return productoService.createProduct(productos);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Integer id){
        return productoService.deleteProduct(id);
    }

    @PutMapping("/{id}")
    public Optional<Productos> updateProduct(@PathVariable Integer id, @RequestBody Productos newProduct){
        return productoService.updateProduct(id, newProduct);
    }

}
