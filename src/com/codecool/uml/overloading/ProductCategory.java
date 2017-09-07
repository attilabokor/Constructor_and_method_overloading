package com.codecool.uml.overloading;

import java.util.concurrent.atomic.AtomicInteger;

public class ProductCategory {

    private int id = count.incrementAndGet();
    private String name;
    private String departament;
    private String description;
    private static final AtomicInteger count = new AtomicInteger(0);



    public ProductCategory(){}

    public ProductCategory(String name, String departament, String description) {
        this.name = name;
        this.departament = departament;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departament='" + departament + '\'' +
                ", description='" + description + '\'' +
                '}';
    }




}


