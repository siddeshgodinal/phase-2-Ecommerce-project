package com.app.ecommerce.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/product_database1";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Handbook7*";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Update to the correct driver class
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to the database.");
        }
    }
}
