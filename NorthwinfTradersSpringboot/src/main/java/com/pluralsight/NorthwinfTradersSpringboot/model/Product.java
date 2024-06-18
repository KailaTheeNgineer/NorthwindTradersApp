package com.pluralsight.NorthwinfTradersSpringboot.model;

// Declaration of the Product class.
public class Product {

    // Protected instance variable for product ID.
    protected int productID;

    // Protected instance variable for the product name.
    protected String name;

    // Protected instance variable for the product category.
    protected String category;

    // Protected instance variable for the product price.
    protected double price;

    // Constructor for the Product class that initializes all instance variables.
    public Product(int productID, String name, String category, double price) {
        // Sets the product ID.
        this.productID = productID;

        // Sets the product name.
        this.name = name;

        // Sets the product category.
        this.category = category;

        // Sets the product price.
        this.price = price;
    }

    // Getter method for productID.
    public int getProductID() {
        // Returns the product ID.
        return productID;
    }

    // Setter method for productID.
    public void setProductID(int productID) {
        // Sets the product ID.
        this.productID = productID;
    }
}

