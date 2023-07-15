package designpatterns.creational.factory.simpleFactory;

public class SalaryDetails {

    private int basic ;
    private int hra;
    private int allowance;

    public SalaryDetails(int basic, int hra, int allowance) {
        this.basic = basic;
        this.hra = hra;
        this.allowance = allowance;
    }

    public int getBasic() {
        return basic;
    }

    public int getHra() {
        return hra;
    }

    public int getAllowance() {
        return allowance;
    }
}
