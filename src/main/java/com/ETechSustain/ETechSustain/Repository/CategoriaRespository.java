package com.ETechSustain.ETechSustain.Repository;

import com.ETechSustain.ETechSustain.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoriaRespository extends JpaRepository<Categoria, Long> {

}