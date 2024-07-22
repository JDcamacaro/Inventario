package com.inventario.Services;

import com.inventario.Model.ModeloInventario;
import com.inventario.Repository.RepoInventario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesInventario {

    final
    RepoInventario repoInventario;
    public ServicesInventario(RepoInventario repoInventario) {
        this.repoInventario = repoInventario;
    }

    public List<ModeloInventario> findAll(){
        return repoInventario.findAll();
    }
    
    public ModeloInventario findById(Long id){
        return repoInventario.getReferenceById(id);
    }

    public ModeloInventario createId(ModeloInventario modeloInventario){
        return repoInventario.save(modeloInventario);
    }

    public void deleteById(Long id){
        repoInventario.deleteById(id);
    }

}
