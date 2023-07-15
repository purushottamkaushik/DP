package designpatterns.structural.adapter;

import designpatterns.structural.adapter.razorpay.RazorPayService;

public class RazorPayAdapter implements PaymentAdapter{

    RazorPayService service = new RazorPayService();
    @Override
    public String payByCC(String cardNo, String cvv, String expiryMonth, String expiryYear) {


        int cardNumber = Integer.parseInt(cardNo);
        int cvvNumber = Integer.parseInt(cvv);
        String expiryDate = expiryMonth.concat("/").concat(expiryYear);
        service.payViaCC(cardNumber,cvvNumber,expiryDate);
        return "SUCCESS BY RAZORPAY";
    }

    @Override
    public PaymentStatus getPaymentStatus(String transactionId) {
        return service.getPaymentStatus("1222");
    }
}
