package designpatterns.behaviural.strategy.factory;

public class CarTravellingStrategy implements PathTravellingStrategy{


    @Override
    public void showPath(String from, String to, TransportMode mode) {
        System.out.println("Travelling through Car");

    }
}
