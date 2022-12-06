package com.data.opr.entity;

import java.util.Objects;

/**
 * @author Huang Xianming
 * @date 2022-12-02-19:09
 */
public class Employee {
    private long id;
    private String name;
    private String department;
    private int status;

    public Employee() {
    }

    public Employee(long id, String name, String department, int status) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee that = (Employee) o;
        return getId() == that.getId() &&
                getStatus() == that.getStatus() &&
                getName().equals(that.getName()) &&
                getDepartment().equals(that.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDepartment(), getStatus());
    }
}
