package JDBC;

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) {
        Connection c = null;
        Statement s = null;
        try {
            //初始化驱动类
            Class.forName("com.mysql.jdbc.Driver");
            //建立与数据库的连接
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8", "root", "123456");
            //创建statement对象，可用以执行SQL语句
            s = c.createStatement();
            String sql = "insert into a value(null," + "'英雄'" + "," + 301.6f + "," + 50 + ")";
            String sql1 = "delete from a where id = 1";
            String sql2 = "update a set name = '盖伦' where id = 2";
            String sql3 = "select * from a";
            //用一个集合来存储从数据库中取出的数据集
            ResultSet rs = s.executeQuery(sql3);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt("damage");
                System.out.printf("%d\t%s\t%.0f\t%d%n", id, name, hp, damage);
            }
            //s.execute(sql2);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } //关闭链接，先关闭statement对象，再关闭Connection对象
        finally {
            if (s != null) {
                try {
                    s.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
