package com.spring.inmobiliaria.repositories.models.dtos.inmueblesDTO;

import com.spring.inmobiliaria.repositories.enums.Disponibilidad;
import com.spring.inmobiliaria.repositories.models.dtos.OficinaDTO;
import com.spring.inmobiliaria.repositories.models.dtos.PropietarioDTO;
import com.spring.inmobiliaria.repositories.models.dtos.ZonaDTO;

public class VillaDTO {
    
    private String direccion;
    private Disponibilidad disponibilidad;
    private float precio;
    private String ref;
    private float superficie;
    private OficinaDTO oficina;
    private PropietarioDTO propietario;
    private ZonaDTO zona;
    private Integer aseos;
    private Integer baños;
    private Integer cocinas;
    private Integer habitaciones;
    private float tamaño;
    private String urbanizacion;

}
