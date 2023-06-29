package com.example.spring_test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @ManyToOne
    private Patient patient;
    @ManyToMany
    private List<Medicine> medicineList;
    private double totalPrice;
    private boolean isConfirmed;

    public Prescription() {

    }
}
