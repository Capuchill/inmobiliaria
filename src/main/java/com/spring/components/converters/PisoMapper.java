package com.spring.components.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.inmobiliaria.repositories.entities.Rol;
import com.spring.inmobiliaria.repositories.models.dtos.inmueblesDTO.PisoDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class PisoMapper {
    @Autowired
    private final ModelMapper model;

    public PisoDTO RolToDTO(Rol rol) {
        PisoDTO rolDTO = model.map(rol, PisoDTO.class);

        return rolDTO;
    }

    public Rol RolDtoToEntity(RolDTO rolDTO) {
        Rol rol = model.map(rolDTO, Rol.class);

        return rol;
    }
}
