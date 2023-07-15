package solid;

public class Ostrich extends Bird implements NonFlyable {

    @Override
    protected void eat() {
        System.out.println("Ostric eating..");
    }
}
