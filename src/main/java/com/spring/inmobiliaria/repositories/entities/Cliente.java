package com.spring.inmobiliaria.repositories.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter @Setter
@NoArgsConstructor
public class Cliente extends Persona {
    
    @OneToMany(mappedBy = "cliente")
    private List<Visita> visitas;
}
