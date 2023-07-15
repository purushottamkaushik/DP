package designpatterns.creational.singleton.v4;

// What if the connection Consturctor requires parameters
public class DatabaseConnection {

    private static final Object obj = new Object();
    private static DatabaseConnection connection; // What if

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if (connection == null ){
            synchronized(obj)  {
                if (connection == null) {
                    connection = new DatabaseConnection();
                }
            }
        }
        return connection;
    }
}
