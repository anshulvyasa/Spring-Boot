package com.example.lecture3_conditional_on_property.db_connection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "sqldb", value = "enabled", havingValue = "true", matchIfMissing = false)
public class SQLConnection {
    public SQLConnection() {
        System.out.println("SQL Connection init");
    }

}
