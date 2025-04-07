package com.andyslabs.volcano.api_server.model;

import java.sql.Connection;

public class SqliteConnection {
    private static Connection connection = null;

    private SqliteConnection() {
        try{
            System.out.println("Connecting to database...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getInstance() {
        if (connection == null) {
            new SqliteConnection();
        }
        return connection;
    }
}
