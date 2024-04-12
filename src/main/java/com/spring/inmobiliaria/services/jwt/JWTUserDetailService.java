package com.spring.inmobiliaria.services.jwt;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set; 

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.inmobiliaria.repositories.PersonalRepository;
import com.spring.inmobiliaria.repositories.entities.Personal;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JWTUserDetailService implements UserDetailsService {

        private final PersonalRepository directorRepository;

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                Optional<Personal> director = this.directorRepository.findByEmail(username);
                
                if(director.isPresent()) {
                        return director
                                .map(usuario -> {
                                        System.out.println("cccc " + usuario.getRol().getNombre().name());
                                        Set<GrantedAuthority> authorities = new HashSet<>();
                                        authorities.add(new SimpleGrantedAuthority(
                                                        usuario.getRol().getNombre().name()));
                
                                        return new User(usuario.getEmail(), usuario.getPassWord(), authorities);
                                })
                                .orElseThrow(() -> new UsernameNotFoundException("User not exist"));
                }

                
                else {
                        return null;
                }
        }
}
