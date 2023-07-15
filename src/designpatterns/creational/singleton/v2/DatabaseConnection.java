package designpatterns.creational.singleton.v2;

public class DatabaseConnection {

    private static DatabaseConnection connection;

    private DatabaseConnection(){

    }

    public synchronized static DatabaseConnection getInstance(){
        // Synchronized is added to make it accessible to one thread at a time

        if (connection == null){
            connection = new DatabaseConnection();
        }
        return connection;
    }


}
