package com.atvd.userdept.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_department")

public class Department {
    // Chave primária e auto incremento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Construtor
    public Department(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
