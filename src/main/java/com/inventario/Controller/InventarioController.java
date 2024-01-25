package com.inventario.Controller;


import com.inventario.Model.ModeloInventario;
import com.inventario.Services.ServicesInventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    final
    ServicesInventario servicesInventario;
    public InventarioController(ServicesInventario servicesInventario) {
        this.servicesInventario = servicesInventario;
    }


    @PostMapping
    public ModeloInventario createInv(@RequestBody ModeloInventario modeloInventario){
        return servicesInventario.createId(modeloInventario);
    }

    @GetMapping
    public ModeloInventario getAll(){
        return (ModeloInventario) servicesInventario.findAll();
    }

    @GetMapping(path = "{id}")
    public ModeloInventario getById(@PathVariable(name = "id") Integer id){
        return servicesInventario.findById(id);
    }

    @DeleteMapping(path = "{id}")
    public void deleteById(@PathVariable(name = "id") Integer id){
        servicesInventario.deleteById(id);
    }
}
