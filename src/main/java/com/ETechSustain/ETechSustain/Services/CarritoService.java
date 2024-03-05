package com.ETechSustain.ETechSustain.Services;

import com.ETechSustain.ETechSustain.Entity.Carrito;

import java.util.List;
import java.util.Optional;

public interface CarritoService {

    public List<Carrito> getAllCarrito();

    public Carrito createCarrito(Carrito carrito);

    public String deleteCarrito(Integer id);

    List<Carrito> getAllCarritosByIdUsuario(Integer id);

    List<Object[]> getResumenCarritoPorUsuario(Integer id);

}
