package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/new_schema_test";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "1q2w3e4r5t";

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connection established");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            throw new RuntimeException(e);
        }
        return connection;
    }
}
