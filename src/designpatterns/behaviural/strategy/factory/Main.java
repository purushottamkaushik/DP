package designpatterns.behaviural.strategy.factory;

public class Main {

    public static void main(String[] args) {
        GoogleMaps maps = new GoogleMaps(TransportMode.BIKE);
        maps.showPath("A" , "B" );
    }
}
