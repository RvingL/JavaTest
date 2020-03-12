package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    List<Connection> list = new ArrayList<>();
    int size;
    //int maxSize;
    //int currentSize;

    public ConnectionPool (int size ) {
        this.size=size;
        init();
    }

    public void init(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            for (int i = 0; i < size; i++) {
               Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8","root","123456");
               list.add(c);
            }
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public synchronized Connection getConnection() {
        while(list.isEmpty()){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return list.remove(0);
    }

    public synchronized void returnConnection(Connection c) {
        list.add(c);
        this.notifyAll();
    }
}
