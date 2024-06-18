package com.pluralsight.NorthwinfTradersSpringboot.dao;

import com.pluralsight.NorthwinfTradersSpringboot.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

// This class implements the ProductDAO interface.
public class ProductDAOImpl implements ProductDAO {

    // Constructor that takes a username and a password as parameters.
    public ProductDAOImpl(String username, String password) {
        // Prints a message to the console indicating the user who signed in.
        System.out.println("User signed in: " + username);
    }

    // Overrides the getByName method from the ProductDAO interface.
    @Override
    public Product getByName() {
        // Currently returns null as a placeholder.
        return null;
    }

    // Overrides the getByCategoryID method from the ProductDAO interface.
    @Override
    public Product getByCategoryID() {
        // Currently returns null as a placeholder.
        return null;
    }

    // Overrides the getAllProducts method from the ProductDAO interface.
    @Override
    public String getAllProducts() {
        // Returns a string indicating that all products are being retrieved.
        return "Getting all products";
    }

    // Overrides the add method from the ProductDAO interface.
    @Override
    public void add(Product product) {
        // Method body is currently empty.
    }

    // Overrides the getAll method from the ProductDAO interface.
    @Override
    public List<Product> getAll() {
        // Returns an empty list of Product objects.
        return List.of();
    }
}
