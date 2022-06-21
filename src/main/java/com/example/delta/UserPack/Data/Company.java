package com.example.delta.UserPack.Data;

import javax.persistence.*;

@Entity
@Table(name="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String shortName;
    private Integer companyTypeId;
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getCompanyTypeId() {
        return companyTypeId;
    }

    public void setCompanyTypeId(Integer companyTypeId) {
        this.companyTypeId = companyTypeId;
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
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", companyTypeId=" + companyTypeId +
                ", addressStreet='" + addressStreet + '\'' +
                ", addressTown=" + addressTown +
                '}';
    }
}
