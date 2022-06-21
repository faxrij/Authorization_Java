package com.example.delta.UserPack.Data;

import javax.persistence.*;

@Entity
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer companyId;
    private Integer departmentTypeId;
    private String addressStreet;
    private Integer addressTown;

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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getDepartmentTypeId() {
        return departmentTypeId;
    }

    public void setDepartmentTypeId(Integer departmentTypeId) {
        this.departmentTypeId = departmentTypeId;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public Integer getAddressTown() {
        return addressTown;
    }

    public void setAddressTown(Integer addressTown) {
        this.addressTown = addressTown;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyId=" + companyId +
                ", departmentTypeId=" + departmentTypeId +
                ", addressStreet='" + addressStreet + '\'' +
                ", addressTown=" + addressTown +
                '}';
    }
}
