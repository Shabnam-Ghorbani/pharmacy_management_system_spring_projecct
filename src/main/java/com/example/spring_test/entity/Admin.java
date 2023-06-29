package com.example.spring_test.entity;

import com.example.spring_test.entity.Enumeration.RoleType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Entity
@Getter
@Setter
public class Admin extends Role {
    String email;
    @Enumerated
    RoleType roleType;

    public Admin(int ID, String username, String password, String email) {
        super(ID, username, password);
        this.email = email;
    }

    public Admin(int ID, String username, String password, String email, RoleType roleType) {
        super(ID, username, password);
        this.email = email;
        this.roleType = roleType;
    }

    public Admin() {

    }
}
