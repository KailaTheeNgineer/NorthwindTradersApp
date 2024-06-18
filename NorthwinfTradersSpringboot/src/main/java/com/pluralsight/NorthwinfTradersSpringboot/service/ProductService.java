package com.pluralsight.NorthwinfTradersSpringboot.service;

import com.pluralsight.NorthwinfTradersSpringboot.dao.ProductDAO;
import com.pluralsight.NorthwinfTradersSpringboot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    private final ProductDAO productDAO;

    @Autowired
    public ProductService(ProductDAO productDAOImpl) {
        this.productDAO = productDAOImpl;
    }

    public List<Product> getAll() {
        return productDAO.getAll();
    }
}
