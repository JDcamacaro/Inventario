package com.inventario.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModeloInventario {

    @Id
    @Column
    private Integer id;
    private String model;
    private String marca;
    private Integer cantidadIn;
    private Integer fechaIn;

}
