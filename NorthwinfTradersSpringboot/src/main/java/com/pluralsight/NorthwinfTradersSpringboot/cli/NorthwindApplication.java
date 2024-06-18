package com.pluralsight.NorthwinfTradersSpringboot.cli;

import com.pluralsight.NorthwinfTradersSpringboot.dao.ProductDAO;
import com.pluralsight.NorthwinfTradersSpringboot.model.Product;
import com.pluralsight.NorthwinfTradersSpringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

// This is the main class for the Northwind application which implements the CommandLineRunner interface.
public class NorthwindApplication implements CommandLineRunner {
    @Autowired
    private ProductDAO productDao;

    // A private final instance variable for the ProductService. The final keyword indicates that this variable cannot be reassigned once initialized.
    private final ProductService productService;

    // The @Autowired annotation tells Spring to automatically inject the ProductService dependency.
    @Autowired
    public NorthwindApplication(ProductService productService) {
        // The constructor initializes the productService instance variable with the injected ProductService instance.
        this.productService = productService;
    }
    // The run method is overridden from the CommandLineRunner interface. It will be executed after the application context is loaded.
    @Override
    public void run(String... args) throws Exception {
        // The method body is currently empty. Logic to be executed after the application starts can be added here.

    }
}
