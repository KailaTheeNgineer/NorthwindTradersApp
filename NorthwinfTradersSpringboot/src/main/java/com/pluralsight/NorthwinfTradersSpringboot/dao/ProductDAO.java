package com.pluralsight.NorthwinfTradersSpringboot.dao;

import com.pluralsight.NorthwinfTradersSpringboot.model.Product;

import java.util.List;

// This is the declaration of the ProductDAO interface.
public interface ProductDAO {

    // Method declaration for getting a product by its name. The method returns a Product object.
    Product getByName();

    // Method declaration for getting a product by its category ID. The method returns a Product object.
    Product getByCategoryID();

    // Method declaration for getting all products as a String. The method returns a String.
    String getAllProducts();

    // Method declaration for adding a new product. The method takes a Product object as a parameter and returns void.
    void add(Product product);

    // Method declaration for getting a list of all products. The method returns a List of Product objects.
    List<Product> getAll();
}
