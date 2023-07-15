package designpatterns.creational.factory.simpleFactory;

public class OldAlgorithm implements TaxRegime{
    @Override
    public double calculateTax(SalaryDetails details) {
        return details.getBasic() * 2;
    }
}
