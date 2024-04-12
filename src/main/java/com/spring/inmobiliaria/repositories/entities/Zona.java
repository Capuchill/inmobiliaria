package com.spring.inmobiliaria.repositories.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

import com.spring.inmobiliaria.repositories.entities.inmuebles.Inmueble;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Zona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    @OneToMany(mappedBy = "zona")
    private List<Inmueble> inmuebles;
}
