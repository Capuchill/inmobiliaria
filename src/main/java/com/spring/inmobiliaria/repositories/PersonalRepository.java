package com.spring.inmobiliaria.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.inmobiliaria.repositories.entities.Personal;
import java.util.Optional;


public interface PersonalRepository extends JpaRepository<Personal, Long>{
    
    Optional<Personal> findByEmail(String email);
}
