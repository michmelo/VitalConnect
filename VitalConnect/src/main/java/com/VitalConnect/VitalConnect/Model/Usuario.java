package com.VitalConnect.VitalConnect.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Usuario {

    private int id;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String email;
    private String password;
    private String rol;
    private String especialidad;

}
