package com.example.lecture4_profile.db_connection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
// import org.springframework.beans.factory.annotation.Value;

import jakarta.annotation.PostConstruct;

@Component
public class DBConnection {
    @Value("${username}")
    String username;
    @Value("${password}")
    String password;

    DBConnection() {
        System.out.println("DB Connection init");
    }

    @PostConstruct
    public void init() {
        System.out.println("User Name is " + username);
        System.out.println("Password is " + password);
    }
}
