package com.javaproject;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        DBFunctions db = new DBFunctions();
        db.connect_to_db("projetJava", "postgres", "admin");
    }
}
