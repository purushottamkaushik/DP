package designpatterns.structural.decorator;

public class RedCone implements IceCreamCone {


    @Override
    public String getConstituents() {
        return " Red Cone";
    }

    @Override
    public int getCost() {
        return 20;
    }
}
