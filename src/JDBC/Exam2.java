package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        Statement stat1 = null;
        Scanner s = new Scanner(System.in);
        try {
            conn = JDBCUtil.getConnection();
            stat = conn.createStatement();
            stat1 = conn.createStatement();
            conn.setAutoCommit(false);
            String sql = "select * from a order by id asc limit 0,10";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                System.out.println("试图删除id为" + id + "的数据");
                String sql1 = "delete from a where id = " + id;
                stat1.execute(sql1);
            }
            while (true) {
                System.out.println("是否确认删除（Y/N）");
                String str = s.next();
                if ("Y".equals(str) || "y".equals(str)) {
                    conn.commit();
                    System.out.println("删除成功");
                    break;
                }
                if ("N".equals(str) || "n".equals(str)) {
                    System.out.println("取消删除");
                    break;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
