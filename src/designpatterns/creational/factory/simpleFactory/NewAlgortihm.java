package designpatterns.creational.factory.simpleFactory;

public class NewAlgortihm implements TaxRegime{
    @Override
    public double calculateTax(SalaryDetails details) {
        return details.getBasic() * 3;
    }
}
