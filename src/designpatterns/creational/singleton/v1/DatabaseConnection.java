package designpatterns.creational.singleton.v1;

public class DatabaseConnection {

    private static DatabaseConnection connection;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        if (connection == null){
            connection = new DatabaseConnection();
        }
        return connection;
    }


}
