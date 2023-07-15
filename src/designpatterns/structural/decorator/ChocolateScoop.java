package designpatterns.structural.decorator;

public class ChocolateScoop implements IceCreamCone{

    IceCreamCone cone ;

    ChocolateScoop(IceCreamCone cone){
        this.cone =cone;
    }


    @Override
    public String getConstituents() {
        return cone.getConstituents() + " Chocolate Scoop";
    }

    @Override
    public int getCost() {
        return cone.getCost() + 5;
    }
}
