package com.codecool.uml.overloading;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Currency;



public class Webshop {
    private final Currency FORINT = Currency.getInstance("HUF");
    private Product theProduct;
    private ProductCategory theProductCategory;
    private Supplier theSupplier;
    private FeaturedProductCategory theFeaturedProductCategory;

    public Webshop(Product theProduct, ProductCategory theProductCategory, Supplier theSupplier, FeaturedProductCategory theFeaturedProductCategory) {
        this.theProduct = theProduct;
        this.theProductCategory = theProductCategory;
        this.theSupplier = theSupplier;
        this.theFeaturedProductCategory = theFeaturedProductCategory;
    }


    public Product getTheProduct() {
        return theProduct;
    }

    public ProductCategory getTheProductCategory() {
        return theProductCategory;
    }

    public Supplier getTheSupplier() {
        return theSupplier;
    }

    public FeaturedProductCategory getTheFeaturedProductCategory() {
        return theFeaturedProductCategory;
    }

    public static void main(String[] args) {


        Supplier theSupplier = new Supplier("Nestle","INDUSTRY LEADING COMPANY");
        ProductCategory theProductCategory = new ProductCategory("SWEETS", "SWEET THINGS", "ALL PRODUCTS MADE OF SUGAR");
        FeaturedProductCategory theFeaturedProductCategory = new FeaturedProductCategory();
        Product theproduct = new Product("big chocolate", 100);

        Webshop theWebshop = new Webshop(theproduct,theProductCategory,theSupplier,theFeaturedProductCategory);


        Supplier theSupplier2 = new Supplier("BMW","BAYERICHE MOTOR WERKE");
        ProductCategory theProductCategory2 = new ProductCategory("CARS", "VECHICLE", "ALL PRODUCTS MADE ITH PROUD");
        FeaturedProductCategory theFeaturedProductCategory2 = new FeaturedProductCategory();
        Product theproduct2 = new Product("335D", 100500);

        Webshop theWebshop2 = new Webshop(theproduct2,theProductCategory2,theSupplier2,theFeaturedProductCategory2);


        System.out.println(theWebshop.getTheProduct().toString());
        System.out.println(theWebshop.getTheSupplier().toString());
        System.out.println(theWebshop2.getTheProduct().toString());
    }


}
