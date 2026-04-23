package com.example.lecture3_conditional_on_property.db_connection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "nosqldb", value = "enabled", havingValue = "true", matchIfMissing = false)
public class NoSQLConnection {
    public NoSQLConnection() {
        System.out.println("No SQL Connection init");
    }
}
