package designpatterns.creational.factory.simpleFactory;

public class Main {
    public static void main(String[] args) {
        SalaryDetails details = new SalaryDetails(1000,0,0);
      double tax=   TaxFactory.getTaxRegime(Regime.OLD)
                .calculateTax(details);
        System.out.println(tax);
    }
}
