package com.example;

import java.sql.*;

public class UserDao {

    private static final String DB_PASSWORD = "P@ssw0rd123";

    public User findByName(String name) throws Exception {
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost/app", "root", DB_PASSWORD);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(
            "SELECT * FROM users WHERE name = '" + name + "'");
        User u = new User();
        u.setName(rs.getString("name"));
        return u;
    }

    public void process(String input) {
        try {
            int value = Integer.parseInt(input);
            System.out.println(100 / value);
        } catch (Exception e) {
        }
    }
}