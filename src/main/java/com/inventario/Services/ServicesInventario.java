package com.inventario.Services;

import com.inventario.Model.ModeloInventario;
import com.inventario.Repository.RepoInventario;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesInventario {

    final
    RepoInventario repoInventario;


    public ServicesInventario(RepoInventario repoInventario) {
        this.repoInventario = repoInventario;

    }

    public ModeloInventario createId(ModeloInventario modeloInventario){
        return repoInventario.save(modeloInventario);
    }

    public List<ModeloInventario> findAll(){
        return repoInventario.findAll();
    }

    public ModeloInventario findById(Integer id){
        return repoInventario.getReferenceById(id);
    }
    public void deleteById(Integer id){
        repoInventario.deleteById(id);
    }

}
