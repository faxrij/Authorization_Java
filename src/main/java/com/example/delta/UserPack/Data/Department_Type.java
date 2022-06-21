package com.example.delta.UserPack.Data;


import javax.persistence.*;

@Entity
@Table(name="department_type")
public class Department_Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department_Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
