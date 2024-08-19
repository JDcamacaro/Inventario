package com.inventario.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.inventario.Model.ModeloInventario;
import com.inventario.Repository.RepoInventario;

@Service
public class ServicesInventario {

    final RepoInventario repoInventario;

    public ServicesInventario(RepoInventario repoInventario) {
        this.repoInventario = repoInventario;
    }

    public ModeloInventario createId(ModeloInventario modeloInventario) {
        return repoInventario.save(modeloInventario);
    }

    public List<ModeloInventario> findAll() {
        return repoInventario.findAll();
    }

    public Optional<ModeloInventario> findById(Integer id) {
        return repoInventario.findById(id);
    }

    public void deleteById(Integer id) {
        repoInventario.deleteById(id);
    }

}
