package com.ETechSustain.ETechSustain.Repository;

import com.ETechSustain.ETechSustain.Entity.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long> {

}