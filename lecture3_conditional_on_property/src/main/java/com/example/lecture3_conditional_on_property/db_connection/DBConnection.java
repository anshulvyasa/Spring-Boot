package com.example.lecture3_conditional_on_property.db_connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DBConnection {
    @Autowired(required = false)
    SQLConnection sqlConnection;
    @Autowired(required = false)
    NoSQLConnection noSqlConnection;

    @PostConstruct
    public void init() {
        System.out.println("Inside The DB Connection");
        System.out.println("SQL Connection " + sqlConnection);
        System.out.println("No SQL Connection " + noSqlConnection);
    }
}
