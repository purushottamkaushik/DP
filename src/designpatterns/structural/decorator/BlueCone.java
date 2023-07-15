package designpatterns.structural.decorator;

public class BlueCone  implements IceCreamCone{


    @Override
    public String getConstituents() {
       return " Blue Cone";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
