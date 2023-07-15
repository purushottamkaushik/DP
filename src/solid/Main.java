package solid;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Bird> birds = List.of(
          new Penguin(),
          new Crow(new CrowSparrowFlyingBehaviour()), // Dependency injection
          new Ostrich(),
          new Pigeon(),
          new Sparrow(new CrowSparrowFlyingBehaviour()) // Dependency injection
        );

        birds.stream().forEach(x-> System.out.println("Weight is :\t" +x.getWeight() ));

        List<Bird> flyables = birds.stream().filter(bird -> bird instanceof NonFlyable).collect(Collectors.toList());
        System.out.println("Flyabble birds: ");
        flyables.stream().forEach(System.out::println);
    }
}
