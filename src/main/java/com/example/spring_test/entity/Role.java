package com.example.spring_test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@Entity
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String username;
    private String password;

    public Role(String username, String password) {
    }

    public Role(int ID) {
        this.ID = ID;
    }

    public Role() {
    }
}
