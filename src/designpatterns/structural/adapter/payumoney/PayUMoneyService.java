package designpatterns.structural.adapter.payumoney;

import designpatterns.structural.adapter.PaymentStatus;

public class PayUMoneyService {

    public String payByCC(String cardNo , String expiryMonth,String expiryYear){
        System.out.println("Payment by PayUMoney");
            return "123";
    }

    public PaymentStatus getStatusById(String transactionId){
        return PaymentStatus.FAILURE;
    }
}
