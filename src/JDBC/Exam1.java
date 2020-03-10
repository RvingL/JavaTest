package JDBC;

import java.sql.*;

public class Exam1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
                Statement s = c.createStatement();
        ) {
            String name = "Rving";
            String password = "123456";
            String sql = "select * from b where name = '" + name + "' and password = '" + password + "'";
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) {
                System.out.println("账号密码正确");
            } else {
                System.out.println("账号密码错误");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
