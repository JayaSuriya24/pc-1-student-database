/*
 * Author Name: M Jaya Suriya
 * Date: 9/16/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentService {
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    //connection
    private Connection connection;

    public StudentService() {
        this.connection = null;
    }

    public boolean connect() throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection != null;
    }

    public void printConnectionStatus() {
        if (connection != null) {
            System.out.println("Connected to the database");
        } else {
            System.err.println("Not connected to the database");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
