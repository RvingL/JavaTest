package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestPool {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool(3);
        for (int i = 0; i < 100; i++) {
            new WalkingThread("walkingThread" + i, pool).start();
        }
    }
}

class WalkingThread extends Thread {
    private ConnectionPool connectionPool;

    public WalkingThread(String name, ConnectionPool pool) {
        super(name);
        this.connectionPool = pool;
    }

    @Override
    public void run() {
        Connection c = connectionPool.getConnection();
        System.out.println(this.getName() + "获取了一个链接，开始工作");
        try (Statement s = c.createStatement()) {
            Thread.sleep(1000);
            s.executeQuery("select * from a");
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        }
        connectionPool.returnConnection(c);
    }
}

