package com.spring.inmobiliaria.repositories.enums;


import java.util.Arrays;

public enum Roles {
    ADMIN,
    USER;

    public static boolean exists(String value) {
        return Arrays.stream(Roles.values())
                .anyMatch(role -> role.name().equalsIgnoreCase(value));
    }

}
