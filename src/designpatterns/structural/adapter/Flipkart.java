package designpatterns.structural.adapter;

public class Flipkart {

    private PaymentAdapter adapter;

    public Flipkart(PaymentAdapter adapter) {
        this.adapter = adapter;
    }

    public void payMoney(String cardNo,String cvv,String expiryMonth , String expiryYear){
      String result =   adapter.payByCC(
                cardNo,
                cvv,
                expiryMonth,
                expiryYear
        );
        System.out.println("Payment :\t" + result);
    }

    public PaymentStatus getPaymentStatus(String transactionId){
       return adapter.getPaymentStatus(transactionId);
    }


}
