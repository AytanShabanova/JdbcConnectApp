package org.example.demo;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String sql="select product_name from product where id=8";
        String url="jdbc:postgresql://localhost:5432/JdbcConnectApp";
        String userName="postgres";
        String password="aytan0909";

            Connection connection= DriverManager.getConnection(url,userName,password);
        Statement st=connection.createStatement();
       ResultSet rs= st.executeQuery(sql);
       rs.next();
      String name= rs.getString(1);
        System.out.println(name);

    }
}
