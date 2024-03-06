package com.ETechSustain.ETechSustain.Services;

import com.ETechSustain.ETechSustain.Repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

import com.ETechSustain.ETechSustain.Entity.Carrito;

@Service
public class CarritoSIMPL implements CarritoService{

    @Autowired
    private CarritoRepository carritoRepository;

    @Override
    public List<Carrito> getAllCarrito() {
        return carritoRepository.findAll();
    }


    @Override
    public Carrito createCarrito(Carrito carrito) {
        return carritoRepository.save(carrito);
    }

    @Override
    public String deleteCarrito(Integer id) {
        carritoRepository.deleteById(Long.valueOf(id));
        return "El carrito fue eliminado con exito";
    }

    @Override
    public List<Carrito> getAllCarritosByIdUsuario(Integer id) {
       return carritoRepository.findAllByUsuario_Id(id);
    }

    @Override
    public List<Object[]> getResumenCarritoPorUsuario(Integer id) {
        return carritoRepository.obtenerResumenCarritoPorUsuario(id);
    }

    @Override
    public List<Carrito> createCarritos(List<Carrito> carritos) {
        return carritoRepository.saveAll(carritos);
    }
}
