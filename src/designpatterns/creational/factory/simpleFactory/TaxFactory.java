package designpatterns.creational.factory.simpleFactory;

public class TaxFactory {

    public  static TaxRegime getTaxRegime(Regime regime){
        switch (regime){
            case OLD:
                return new OldAlgorithm();
            case NEW:
                return new NewAlgortihm();
        }
        throw new RuntimeException("No regime");
    }
}
