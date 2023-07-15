package designpatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(new PayUMoneyAdapter());
        flipkart.payMoney("22","345","12","22");
        System.out.println(flipkart.getPaymentStatus("11").name());

    }
}
