package com.pojo;

public class Employee {
    private String name;
    private String address;
    private String id;
    private Boolean isContractor;

    public Employee(String name, String address, String id, Boolean isContractor) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.isContractor = isContractor;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Employee setAddress(String address) {
        this.address = address;
        return this;
    }

    public Employee setId(String id) {
        this.id = id;
        return this;
    }

    public Employee setContractor(Boolean contractor) {
        isContractor = contractor;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id='" + id + '\'' +
                ", isContractor=" + isContractor +
                '}';
    }
}
