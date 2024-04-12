package com.spring.inmobiliaria.repositories.entities;



import com.spring.inmobiliaria.repositories.entities.inmuebles.Inmueble;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter @Setter
public class Propietario extends Persona{
    private String telefono;
    @OneToMany(mappedBy = "propietario")
    private List<Inmueble> inmuebles;
}
