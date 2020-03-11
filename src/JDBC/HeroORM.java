package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HeroORM implements DAO {
    @Override
    public void add(Hero hero) {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "insert into a values (null,?,?,?)";
        try {
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, hero.name);
            ps.setFloat(2, hero.hp);
            ps.setInt(3, hero.damage);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(ps, conn);
        }
    }

    @Override
    public void delete(Hero hero) {
        Connection conn = null;
        Statement s = null;
        try {
            conn = JDBCUtil.getConnection();
            s = conn.createStatement();
            String sql = "delete from a where id = " + hero.id;
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(s, conn);
        }
    }

    @Override
    public Hero get(int id) {
        return null;
    }

    @Override
    public void update(Hero hero) {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "update a set name = ? , hp = ? , damage = ? where id = ?";
        try {
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, hero.name);
            ps.setFloat(2, hero.hp);
            ps.setInt(3, hero.damage);
            ps.setInt(4, hero.id);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(ps, conn);
        }
    }

    @Override
    public List<Hero> list() {
        List<Hero> list = new ArrayList<>();
        Connection conn = null;
        Statement s = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtil.getConnection();
            s = conn.createStatement();
            String sql = "select * from a";
            rs = s.executeQuery(sql);
            while (rs.next()) {
                Hero hero = new Hero();
                hero.id = rs.getInt(1);
                hero.name = rs.getString(2);
                hero.hp = rs.getFloat(3);
                hero.damage = rs.getInt(4);
                list.add(hero);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, s, conn);
        }
        return list;
    }

    @Override
    public List<Hero> list(int start, int count) {
        return null;
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.id = 104;
        hero.name = "亚索";
        hero.hp = 306.2f;
        hero.damage = 60;
        //List<Hero> list=HeroORM.list();
        //for (Hero h:list) {
        //    System.out.println(h);
        //}
    }
}
