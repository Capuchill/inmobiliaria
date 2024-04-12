package com.spring.inmobiliaria.repositories.entities.inmuebles;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
@Entity
public class Local extends Inmueble{
    
    private Integer puertas;
    private String diafano;
    private String acondicioando;
    
}
