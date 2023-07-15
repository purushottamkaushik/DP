package designpatterns.creational.singleton.v2;

public class Test {
    public static void main(String[] args) {
        DatabaseConnection connection = DatabaseConnection.getInstance();
        System.out.println(connection);

        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        System.out.println(connection1);



    }
}
