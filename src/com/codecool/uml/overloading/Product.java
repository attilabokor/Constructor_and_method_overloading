package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    private String id;
     private Set<String> productClones = new HashSet<>();
     private String name;
     private float defaultprice;
     private Currency defaultCurrency;
     private ProductCategory productCategory;
     private Supplier supplier;






    public Product(){ }

    public Product(String name, float defaultprice) {
        this.id =generateid();
        this.name = name;
        this.defaultprice = defaultprice;
    }

    private String generateid() {
        String productid;
        do {
            productid = Integer.toString((int) Math.floor(Math.random() * 1000) + 1);
        } while (productClones.contains(productid));
        productClones.add(productid);
        return productid;}


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultprice() {
        return defaultprice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public void setDefaultprice(float defaultprice) {
        this.defaultprice = defaultprice;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", defaultprice=" + defaultprice +
                ", defaultCurrency=" + defaultCurrency +
                ", productCategory=" + productCategory +
                ", supplier=" + supplier +
                '}';
    }


}



