package com.atvd.userdept.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_user")
public class User {


    // Chave primária e auto incremento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    /* Relação no banco de dados (muitos para um) ou seja um departamento para muitos usuarios
    JoinColumn para ser uma chave estrangeira na tabela de tb_user
     */
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // Construtor
    public User(){

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
