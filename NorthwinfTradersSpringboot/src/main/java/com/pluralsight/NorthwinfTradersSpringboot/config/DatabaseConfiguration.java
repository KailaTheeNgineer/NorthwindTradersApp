package com.pluralsight.NorthwinfTradersSpringboot.config;

import org.apache.commons.dbcp2.BasicDataSource;

public class DatabaseConfiguration {

    private BasicDataSource dataSource;

    public DatabaseConfiguration(String username, String password){
        // Create the datasource
        this.dataSource = new BasicDataSource();

        // Configure the datasource
        dataSource.setUrl("jdbc:mysql://localhost:3306/Northwin");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

    }



}
