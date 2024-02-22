package com.ETechSustain.ETechSustain.Controllers;

import com.ETechSustain.ETechSustain.Repository.CarritoRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carrito")

public class CarritoController {

    private CarritoRepository carritoRepository;

    public CarritoController(CarritoRepository carritoRepository) {
        this.carritoRepository = carritoRepository;
    }

        @PostMapping
        public String createCarrito(){
            return "Carrito creado";
        }

        @GetMapping
        public String GetAllCarritos(){
            return "Carritos obtenidos";
        }

        @PutMapping("/{id}")
        public String UpdateCarrito(@PathVariable Long id) {
            return "Carrito actualizado";
        }

        @DeleteMapping("/{id}")
        public String deleteCarrito (@PathVariable Long id){
            return "Carrito eliminado";
        }
}
