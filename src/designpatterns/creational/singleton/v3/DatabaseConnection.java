package designpatterns.creational.singleton.v3;

// What if the connection Consturctor requires parameters
public class DatabaseConnection {

    private static DatabaseConnection connection = new DatabaseConnection(); // What if

    private DatabaseConnection(String url , String username , String password) {}
    private DatabaseConnection(){ }

    public static DatabaseConnection getInstance(){
        // No concurrency issue as the instance is initialized at class level;
        return connection;
    }
}
