package com.ETechSustain.ETechSustain.Repository;

import com.ETechSustain.ETechSustain.Entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
    public Optional<Usuarios> findByCorreo(String correo);

    @Query(value = "SELECT * FROM Usuarios u WHERE u.deleted_at IS NULL", nativeQuery = true)
    List<Usuarios> findAllActiveUsers();
}
