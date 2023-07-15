package designpatterns.behaviural.strategy.registry;

import java.util.HashMap;
import java.util.Map;

public class TravellingPathRegistry {

   static Map<TransportMode , PathTravellingStrategy> registry= new HashMap<>();


    public void addStrategyToRegistry(TransportMode mode , PathTravellingStrategy pathTravellingStrategy){
        registry.put(mode,pathTravellingStrategy);

    }

    public static PathTravellingStrategy getStrategy(TransportMode mode){
        return registry.get(mode);
    }


}
