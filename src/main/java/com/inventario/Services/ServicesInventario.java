package com.inventario.Services;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.inventario.Model.ModeloInventario;
import com.inventario.Repository.RepoInventario;
=======
import com.inventario.Model.ModeloInventario;
import com.inventario.Repository.RepoInventario;
import org.springframework.stereotype.Service;

import java.util.List;
>>>>>>> d96c9b492003b9cdbe6fe31330189b11e92deeb0

@Service
public class ServicesInventario {

<<<<<<< HEAD
    final RepoInventario repoInventario;

    public ServicesInventario(RepoInventario repoInventario) {
        this.repoInventario = repoInventario;
=======
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
>>>>>>> d96c9b492003b9cdbe6fe31330189b11e92deeb0
    }

    public ModeloInventario createId(ModeloInventario modeloInventario) {
        return repoInventario.save(modeloInventario);
    }

<<<<<<< HEAD
    public List<ModeloInventario> findAll() {
        return repoInventario.findAll();
    }

    public Optional<ModeloInventario> findById(Integer id) {
        return repoInventario.findById(id);
    }

    public void deleteById(Integer id) {
=======
    public void deleteById(Long id){
>>>>>>> d96c9b492003b9cdbe6fe31330189b11e92deeb0
        repoInventario.deleteById(id);
    }

}
