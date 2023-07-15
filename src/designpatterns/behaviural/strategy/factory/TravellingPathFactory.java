package designpatterns.behaviural.strategy.factory;

public class TravellingPathFactory {

    public static PathTravellingStrategy getTravellingStrategy(TransportMode mode){
        if (mode == TransportMode.CAR){
            return new CarTravellingStrategy();
        } else if (mode == TransportMode.BIKE){
            return new BikeTravellingStrategy();
        } else {
            return new WalkTravellingStrategy();
        }
    }
}
