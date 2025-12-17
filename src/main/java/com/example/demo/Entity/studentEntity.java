package com.example.demo.entity;

import jakarta.persistence.*;

public class studentEntity{

    private Long id;

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @
    private String name;

    @Email(message = "Email Format is not Valid")
    @NotBlank
    private String email;


}