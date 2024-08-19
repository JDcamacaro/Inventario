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

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    final ServicesInventario servicesInventario;

    public InventarioController(ServicesInventario servicesInventario) {
        this.servicesInventario = servicesInventario;
    }

    @PostMapping
    public ModeloInventario createInv(@RequestBody ModeloInventario modeloInventario) {
        return servicesInventario.createId(modeloInventario);
    }

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
        servicesInventario.deleteById(id);
    }
}
