package com.codecool.uml.overloading;

import java.awt.*;
import java.security.PublicKey;
import java.util.Currency;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    private int id = count.incrementAndGet();
    private static final AtomicInteger count = new AtomicInteger(0);
     private String name;
     private float defaultprice;
     private Currency defaultCurrency = Currency.getInstance("HUF");
     private ProductCategory productCategory;
     private Supplier supplier;
    static List productlist;

    public static List getProductlist() {
        return productlist;
    }

    public static void setProductlist(List productlist) {
        Product.productlist = productlist;
    }

    public Product(){ }

    public Product(String name, float defaultprice) {
        this.id = id;
        this.name = name;
        this.defaultprice = defaultprice;
    }

  //  private String generateid() {
  //      String productid;
   //     do {
   //         productid = Integer.toString((int) Math.floor(Math.random() * 1000) + 1);
 //       } while (productClones.contains(productid));
 //       productClones.add(productid);
 //       return productid;}


    public int getId() {
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



