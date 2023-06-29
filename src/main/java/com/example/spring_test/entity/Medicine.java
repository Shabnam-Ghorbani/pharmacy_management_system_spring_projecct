package com.example.spring_test.entity;

import com.example.spring_test.entity.Enumeration.MedType;
import com.example.spring_test.entity.Enumeration.UsageType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private boolean isAvailable;
    private String genericName;
    private String commercialName;
    private int dose;
    @Enumerated
    private UsageType usageType;
    @Enumerated
    private MedType medType;
    private double price;

    public Medicine() {

    }
}
