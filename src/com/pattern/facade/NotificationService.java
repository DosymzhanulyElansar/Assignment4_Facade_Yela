package com.pattern.facade;

public class NotificationService {
    public void sendOrderConfirmation(String customerEmail, String orderDetails) {
        System.out.println("[NotificationService] Email sent to " + customerEmail + ": " + orderDetails);
    }
}
