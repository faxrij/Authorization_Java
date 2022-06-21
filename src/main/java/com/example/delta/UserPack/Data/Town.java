package com.example.delta.UserPack.Data;

import javax.persistence.*;

@Entity
@Table(name="town")
public class Town {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer regionId;
    private Integer cityId;


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

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getCityId() {
        return cityId;
    }

    @Override
    public String toString() {
        return "Town{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", regionId=" + regionId +
                ", cityId=" + cityId +
                '}';
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}
