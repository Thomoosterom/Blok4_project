package nl.hu.blok4.v2;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Test {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/Student";
        String user = "postgres";
        String password = "hallo123";
        try {
        Connection Mycon = DriverManager.getConnection(url, user, password);
        Statement Mysta = Mycon.createStatement();
        String sql = "INSERT INTO activiteit (naam,activiteitnr,omschrijving,tijd)"
                + " VALUES ('abd',4, 'Eng',6)";

        ResultSet resultSet = Mysta.executeQuery(sql);

        while (resultSet.next()) {

            System.out.println("het is gelukt");
        }
                } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
    }


}

