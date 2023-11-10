package com.javaproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBFunctions {
    public Connection connect_to_db(String dbName, String user, String pass) {
        Connection conn = null;
        try {
            // Chargez le pilote JDBC PostgreSQL
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbName, user, pass);
            if (conn != null) {
                System.out.println("Connection etablished");
            } else {
                System.out.println("Connection failed");

            }
            // Établissez la connexion
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
