package com.ETechSustain.ETechSustain.Controllers;

import com.ETechSustain.ETechSustain.Entity.Carrito;
import com.ETechSustain.ETechSustain.Repository.CarritoRepository;
import com.ETechSustain.ETechSustain.Services.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carrito")
//@CrossOrigin("")

public class CarritoController {

    @Autowired
    private CarritoService carritoService;


    @PostMapping
    public Carrito createCarrito(@RequestBody Carrito carrito) {
        return carritoService.createCarrito(carrito);
    }

    @GetMapping
    public List<Carrito> getAllCarrito() {
        return carritoService.getAllCarrito();
    }

    @DeleteMapping("/{id}")
    public String deleteCarrito(@PathVariable Integer id) {
        return carritoService.deleteCarrito(id);
    }

    @GetMapping("/usuario/{id}")
    public List<Carrito> getAllCarritosByIdUsuario(@PathVariable Integer id) {
        return carritoService.getAllCarritosByIdUsuario(id);
    }

    @GetMapping("/resumen/{id}")
    public List<Object[]> getResumenCarritoPorUsuario(@PathVariable Integer id) {
        return carritoService.getResumenCarritoPorUsuario(id);
    }
}
