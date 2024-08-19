package com.inventario.Controller;

import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.inventario.Model.ModeloInventario;
import com.inventario.Services.ServicesInventario;
<<<<<<< HEAD
=======

import java.util.List;

import org.springframework.web.bind.annotation.*;
>>>>>>> d96c9b492003b9cdbe6fe31330189b11e92deeb0

@RestController
@RequestMapping("inventario")
public class InventarioController {

    final ServicesInventario servicesInventario;

    public InventarioController(ServicesInventario servicesInventario) {
        this.servicesInventario = servicesInventario;
    }
<<<<<<< HEAD

=======
    
    @GetMapping
    public List<ModeloInventario> getAll(){
        return servicesInventario.findAll();
    }
    
    @GetMapping(path = "/{id}")
    public ModeloInventario getById(@PathVariable(name = "id") Long id) {
        return servicesInventario.findById(id);
    }
    
>>>>>>> d96c9b492003b9cdbe6fe31330189b11e92deeb0
    @PostMapping
    public ModeloInventario createInv(@RequestBody ModeloInventario modeloInventario) {
        return servicesInventario.createId(modeloInventario);
    }

<<<<<<< HEAD
    @GetMapping
    public ModeloInventario getAll() {
        return (ModeloInventario) servicesInventario.findAll();
    }

    @GetMapping(path = "{id}")
    public Optional<ModeloInventario> getById(@PathVariable(name = "id") Integer id) {
        return servicesInventario.findById(id);
    }

    @DeleteMapping(path = "{id}")
    public void deleteById(@PathVariable(name = "id") Integer id) {
=======
    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable(name = "id") Long id){
>>>>>>> d96c9b492003b9cdbe6fe31330189b11e92deeb0
        servicesInventario.deleteById(id);
    }
}
