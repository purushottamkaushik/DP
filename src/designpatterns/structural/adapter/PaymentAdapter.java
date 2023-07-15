package designpatterns.structural.adapter;

public interface PaymentAdapter {

    String payByCC(String cardNo,String cvv,String expiryMonth,String expiryYear);

    PaymentStatus getPaymentStatus(String transactionId);
}
