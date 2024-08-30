package db;

import model.AddItems;

import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    private  static DBConnection instance = new DBConnection();
    private List<AddItems> connection;

    private DBConnection() {
        connection =new ArrayList<>();
    }
    public List<AddItems> getConnection() {
        return connection;
    }
    public static DBConnection getInstance() {
        return null == instance?instance = new DBConnection():instance;
    }
}
