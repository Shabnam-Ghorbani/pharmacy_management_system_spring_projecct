package com.example.spring_test.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
@ToString
@AllArgsConstructor
public class Patient extends Role {
    String phone;
    String address;
    String email;

    public Patient() {

    }
}
