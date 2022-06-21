package com.example.delta.UserPack.Data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="user_role")
@Setter
@Getter
public class User_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;


    @Override
    public String toString() {
        return "User_Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
