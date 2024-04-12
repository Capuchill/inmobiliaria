package com.spring.inmobiliaria.repositories.entities.inmuebles;

import com.spring.inmobiliaria.repositories.enums.TipoPiso;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter @Getter
@Entity
public class Piso extends Inmueble{
    
    private Integer habitaciones;
    private Integer baños;
    private Integer aseos;
    private Integer cocinas;
    @Enumerated(EnumType.STRING)
    private TipoPiso tipo_piso;
}
