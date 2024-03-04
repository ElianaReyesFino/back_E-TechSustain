package com.ETechSustain.ETechSustain.Repository;

import com.ETechSustain.ETechSustain.Entity.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long> {


    List<Carrito> findAllByUsuario_Id(Integer id);

    @Query("SELECT c.usuario.id, SUM(c.precio_total) AS total_precio, SUM(c.cantidad) AS total_cantidad FROM Carrito c GROUP BY c.usuario.id")
    List<Object[]> obtenerResumenCarritoPorUsuario(@Param("userId") Integer id);
}