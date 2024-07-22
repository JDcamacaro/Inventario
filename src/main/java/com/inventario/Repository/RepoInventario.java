package com.inventario.Repository;

import com.inventario.Model.ModeloInventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepoInventario extends JpaRepository<ModeloInventario, Long> {

}
