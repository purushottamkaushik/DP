package designpatterns.structural.adapter;

import designpatterns.structural.adapter.payumoney.PayUMoneyService;
import designpatterns.structural.adapter.razorpay.RazorPayService;

public class PayUMoneyAdapter implements PaymentAdapter{

    PayUMoneyService service = new PayUMoneyService();
    @Override
    public String payByCC(String cardNo, String cvv, String expiryMonth, String expiryYear) {
        service.payByCC(cardNo,expiryMonth,expiryYear);
        return "BY PayUMoney";
    }

    @Override
    public PaymentStatus getPaymentStatus(String transactionId) {

        return service.getStatusById("1222");
    }
}
