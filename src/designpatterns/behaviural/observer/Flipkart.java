package designpatterns.behaviural.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flipkart {

    Map<Events, List<Subscriber>> map = new HashMap<>();

    public void registerSubscriber(Events e , Subscriber s){
        if (!map.containsKey(e)){ // Check if subscriber event is there int the map or not if not then add it.
            map.put(e,new ArrayList<>());
        }
        map.get(e).add(s);

    }

    public void notify(Events e , Order o){
        for (Subscriber subscriber : map.get(e)){
            subscriber.listen(e,o);
            createInvoice(e,o);
        }
    }

    private void createInvoice(Events e, Order o) {

        if (e == Events.ORDER_PLACED ) {
            System.out.println("Order with order id " + o.getOrderId() + " Placed Success.." );
        } else {
            System.out.println("Order cancelled , OrderId : " + o.getOrderId());
        }
    }


}
