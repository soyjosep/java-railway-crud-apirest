package com.josephcode.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josephcode.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
