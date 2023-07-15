package designpatterns.behaviural.strategy.registry;

public class GoogleMaps {

    private PathTravellingStrategy pathTravellingStrategy ;
    private TransportMode mode ;
    GoogleMaps(TransportMode mode){
        this.mode = mode;
        this.pathTravellingStrategy = TravellingPathRegistry.getStrategy(mode);
    }

    public void showPath(String from , String to){

        System.out.println("Going from " + from + " to " + to + "using " + mode.name());

    }
}
