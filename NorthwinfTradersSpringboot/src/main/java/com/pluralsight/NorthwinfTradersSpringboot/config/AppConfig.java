package com.pluralsight.NorthwinfTradersSpringboot.config;

import com.pluralsight.NorthwinfTradersSpringboot.dao.ProductDAO;
import com.pluralsight.NorthwinfTradersSpringboot.dao.ProductDAOImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// The @Configuration annotation indicates that this class contains Spring configuration.
@Configuration
public class AppConfig {

    // The @Value annotation is used to inject the value of the datasource.username property from the application properties file into the username variable.
    @Value("${datasource.username}")
    private String username;

    // The @Value annotation is used to inject the value of the datasource.password property from the application properties file into the password variable.
    @Value("${datasource.password}")
    private String password;


    // The @Bean annotation indicates that this method produces a bean to be managed by the Spring container.
    @Bean
    public ProductDAO productDAO() {
        // This method returns a new instance of ProductDAOImpl, passing in the username and password as parameters.
        return new ProductDAOImpl(username, password);
    }
}

