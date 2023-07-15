package solid;

public class Crow extends Bird implements Flyable{

    private FlyingBehaviour behaviour;

    Crow(FlyingBehaviour behaviour){
        this.behaviour = behaviour;
    }
    @Override
    public void fly() {
            behaviour.fly();
    }
}
