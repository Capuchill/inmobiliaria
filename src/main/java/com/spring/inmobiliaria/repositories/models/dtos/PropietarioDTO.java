package com.spring.inmobiliaria.repositories.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class PropietarioDTO {
    private String numero;
    private String p_nombre;
    private String p_apellido;
}
