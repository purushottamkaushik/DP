package designpatterns.structural.adapter.razorpay;

import designpatterns.structural.adapter.PaymentStatus;

public class RazorPayService {

   public void payViaCC(int cardNumber, int cvv,String expiryDate){
       System.out.println("Payment success by razorPay");
    }

    public PaymentStatus getPaymentStatus(String transactionId){
       return PaymentStatus.SUCCESS;
    }
}
