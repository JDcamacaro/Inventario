package com.inventario.Controller;


import com.inventario.Model.ModeloInventario;
import com.inventario.Services.ServicesInventario;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("inventario")
public class InventarioController {

    final
    ServicesInventario servicesInventario;
    public InventarioController(ServicesInventario servicesInventario) {
        this.servicesInventario = servicesInventario;
    }
    
    @GetMapping
    public List<ModeloInventario> getAll(){
        return servicesInventario.findAll();
    }
    
    @GetMapping(path = "/{id}")
    public ModeloInventario getById(@PathVariable(name = "id") Long id) {
        return servicesInventario.findById(id);
    }
    
    @PostMapping
    public ModeloInventario createInv(@RequestBody ModeloInventario modeloInventario){
        return servicesInventario.createId(modeloInventario);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable(name = "id") Long id){
        servicesInventario.deleteById(id);
    }
}
