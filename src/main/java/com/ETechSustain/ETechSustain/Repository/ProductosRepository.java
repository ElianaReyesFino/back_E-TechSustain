package com.ETechSustain.ETechSustain.Repository;

import com.ETechSustain.ETechSustain.Entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Long> {

}