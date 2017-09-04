package com.codecool.uml.overloading;

public class ProductCategory {

    private int id;
    private String name;
    private String departament;
    private String description;


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


