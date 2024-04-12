package com.spring.inmobiliaria.repositories.entities;

import com.spring.inmobiliaria.repositories.entities.inmuebles.Inmueble;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    private Inmueble inmueble;

    @ManyToOne
    private Cliente cliente;
    
    private String comentario;

    @Temporal(TemporalType.DATE)
    private LocalDate fecha;
}
