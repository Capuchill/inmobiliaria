package com.spring.inmobiliaria.repositories.enums;

import java.util.Arrays;

public enum TipoInmueble {
    PISO,
    VILLA,
    CASA,
    LOCAL;

    public static boolean exists(String value) {
        return Arrays.stream(TipoInmueble.values())
                .anyMatch(role -> role.name().equalsIgnoreCase(value));
    }
}
