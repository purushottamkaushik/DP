package designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        IceCreamCone cone = new ChocolateScoop(new BlueCone());
        IceCreamCone vanilla = new VanillaScoop(cone);

        System.out.println(cone.getConstituents());
        System.out.println(cone.getCost());


        System.out.println("============================");
        System.out.println(vanilla.getConstituents());
        System.out.println(vanilla.getCost());



    }
}
