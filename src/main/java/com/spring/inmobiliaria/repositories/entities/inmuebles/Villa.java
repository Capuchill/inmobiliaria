package com.spring.inmobiliaria.repositories.entities.inmuebles;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
@Entity
public class Villa extends Inmueble{
    
    private Integer habitaciones;
    private Integer baños;
    private Integer aseos;
    private Integer cocinas;
    private float tamaño;
    private String urbanizacion;
    private String caracteristicas;

}