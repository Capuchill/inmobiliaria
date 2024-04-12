-- Active: 1712863708295@@127.0.0.1@3306

drop database filtro;

CREATE DATABASE Filtro
    DEFAULT CHARACTER SET = 'utf8mb4';

INSERT INTO personal (cedula, p_nombre, p_apellido, email, pass_word, rol_id)
VALUES (123456789, "admin", "admin","admin@mail.com", "admin", 1)

INSERT into roles ( nombre, descripcion) values 
(1, "permiso en todo"),
(2, "permisos en consultas");