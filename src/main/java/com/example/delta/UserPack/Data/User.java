package com.example.delta.UserPack.Data;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
@Getter
@Setter
@Entity
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "User_Role_ID")
    private Integer userRoleId;
    @Column(name = "Department_ID")

    private Integer departmentId;
    @Column(name = "Name")

    private String name;
    @Column(name = "Surname")

    private String surName;
    @Column(name = "Email_Address")
    private String emailAdress;
    @Column(name = "Password")

    private String password;
    @Column(name = "Is_Active")

    private Integer is_active;

    public Collection<? extends GrantedAuthority> getAuthorities(){
        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority("ADMIN");
    return Collections.singleton(simpleGrantedAuthority);
    }




    public User(Integer userRoleId, Integer departmentId, String name, String surName, String emailAdress, String password, Integer is_active) {
        this.userRoleId = userRoleId;
        this.departmentId = departmentId;
        this.name = name;
        this.surName = surName;
        this.emailAdress = emailAdress;
        this.password = password;
        this.is_active = is_active;
    }

    public User() {

    }
}
