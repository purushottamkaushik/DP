package solid;

public class Sparrow extends Bird implements Flyable{


    public  FlyingBehaviour behaviour;

    Sparrow(FlyingBehaviour behaviour){
        this.behaviour = behaviour;
    }

    @Override
    public void fly() {
         behaviour.fly();
    }
}
