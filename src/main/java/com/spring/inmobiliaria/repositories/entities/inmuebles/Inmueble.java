package com.spring.inmobiliaria.repositories.entities.inmuebles;


import com.spring.inmobiliaria.repositories.entities.Oficina;
import com.spring.inmobiliaria.repositories.entities.Propietario;
import com.spring.inmobiliaria.repositories.entities.Visita;
import com.spring.inmobiliaria.repositories.entities.Zona;
import com.spring.inmobiliaria.repositories.enums.Disponibilidad;
import com.spring.inmobiliaria.repositories.enums.TipoInmueble;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Inmueble {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    private String ref;

    @ManyToOne
    private Oficina oficina;

    @Enumerated(EnumType.STRING)
    private TipoInmueble tipo;

    @Enumerated(EnumType.STRING)
    private Disponibilidad disponibilidad;

    private float superficie;

    private String direccion;

    private float precio;
    
    @ManyToOne
    private Zona zona;

    @ManyToOne
    private Propietario propietario;

    @OneToMany(mappedBy = "inmueble")
    private List<Visita> visitas;

}
