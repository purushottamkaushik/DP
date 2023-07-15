package designpatterns.behaviural.strategy.registry;

public class Main {

    public static void main(String[] args) {
        TravellingPathRegistry registry = new TravellingPathRegistry();
        registry.addStrategyToRegistry(TransportMode.BIKE,new BikeTravellingStrategy());
        registry.addStrategyToRegistry(TransportMode.WALK,new WalkTravellingStrategy());
        registry.addStrategyToRegistry(TransportMode.CAR,new CarTravellingStrategy());
        GoogleMaps maps = new GoogleMaps(TransportMode.CAR);

        maps.showPath("A" , "B");
    }
}
