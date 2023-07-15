package designpatterns.behaviural.observer;

public class InventoryManagementService implements Subscriber{
    @Override
    public void listen(Object type, Order o) {
        System.out.println("InventoryManagement Service Listening" + o.getOrderId());
    }
}
