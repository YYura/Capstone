package com.example.capstone.jdbc;

import java.sql.*;

public class JDBCTest {
    static {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        ResultSet rs = null;
        Connection con = null;
        Statement stmt = null;
        try{
            String dbUrl = "jdbc:oracle:thin:@10.30.3.95:1521:orcl";
            con = DriverManager.getConnection(dbUrl, "c##1901115", "p1901115");
            stmt = con.createStatement();

            rs = stmt.executeQuery("SELECT member_code From member");
        }catch (SQLException e){

        }finally {
            try {
                rs.close();
                stmt.close();
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
