package com.example.org.facadepatterndemo;

/**
 * Check inventory and payment process
 * Created by swati on 20/12/16.
 */

public class OrderPayment {
    private Payment payment = new Payment();
    private Inventory inventory = new Inventory();
    public String placeOrder(String orderId){
        String checkInventory = inventory.checkInventory(orderId);
        String checkPayment = payment.deductPayment(orderId);
        String checkOrderPayment = "Order processing completed : " + checkInventory + " and " +
                checkPayment;
        return checkOrderPayment;
    }
}
