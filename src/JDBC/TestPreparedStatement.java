package JDBC;

import java.sql.*;

public class TestPreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "insert into b values (null,?,?)";
        String sql1 = "select * from a where name = ?";
        try (
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=utf8", "root", "123456");
                PreparedStatement ps = c.prepareStatement(sql1);
        ) {
            ps.setString(1, "盖伦");
            //ps.setString(2,"123456");
            //ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id=rs.getInt(1);
                String name = rs.getString("name");
                //String password = rs.getString(3);
                System.out.printf("%d\t %s\t %n",id,name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
