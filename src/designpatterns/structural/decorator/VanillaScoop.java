package designpatterns.structural.decorator;

public class VanillaScoop implements IceCreamCone{

    IceCreamCone cone ;

    VanillaScoop(IceCreamCone cone){
        this.cone =cone;
    }


    @Override
    public String getConstituents() {
        return cone.getConstituents() + " Vanilla";
    }

    @Override
    public int getCost() {
        return cone.getCost() + 40;
    }
}
