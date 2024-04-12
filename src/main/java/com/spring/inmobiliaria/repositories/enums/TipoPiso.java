package com.spring.inmobiliaria.repositories.enums;

import java.util.Arrays;

public enum TipoPiso {
    NUEVO,
    OCASION;

    public static boolean exists(String value) {
        return Arrays.stream(TipoPiso.values())
                .anyMatch(role -> role.name().equalsIgnoreCase(value));
    }
}
