package com.codecool.uml.overloading;

import java.util.concurrent.atomic.AtomicInteger;

public class Supplier {
    private int id = count.incrementAndGet();
    private String name;
    private String description;
    private static final AtomicInteger count = new AtomicInteger(0);


    public Supplier(){}

    public Supplier(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
