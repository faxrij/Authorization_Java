package com.example.delta.UserPack.Data;

import javax.persistence.*;

@Entity
@Table(name="department_hierarchy")
public class Department_Hierarchy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer childDepartmentId;
    private Integer parentDepartmentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChildDepartmentId() {
        return childDepartmentId;
    }

    public void setChildDepartmentId(Integer childDepartmentId) {
        this.childDepartmentId = childDepartmentId;
    }

    public Integer getParentDepartmentId() {
        return parentDepartmentId;
    }

    public void setParentDepartmentId(Integer parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    @Override
    public String toString() {
        return "Department_Hierarchy{" +
                "id=" + id +
                ", childDepartmentId=" + childDepartmentId +
                ", parentDepartmentId=" + parentDepartmentId +
                '}';
    }
}
