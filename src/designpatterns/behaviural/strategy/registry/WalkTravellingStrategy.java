package designpatterns.behaviural.strategy.registry;

public class WalkTravellingStrategy implements PathTravellingStrategy {


    @Override
    public void showPath(String from, String to, TransportMode mode) {
        System.out.println("Travelling through Walk..");
    }
}
