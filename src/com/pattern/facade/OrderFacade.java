package com.pattern.facade;

public class OrderFacade {
    private final InventoryService inventoryService;
    private final PaymentProcessor paymentProcessor;
    private final ShippingService shippingService;
    private final NotificationService notificationService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentProcessor = new PaymentProcessor();
        this.shippingService = new ShippingService();
        this.notificationService = new NotificationService();
    }

    public boolean placeOrder(String itemCode, int quantity, double price, String accountId, String address, String email) {
        System.out.println("\n--- Starting Order Placement Process ---");

        if (!inventoryService.checkStock(itemCode, quantity)) {
            System.out.println("Order Failed: Item out of stock.");
            return false;
        }

        inventoryService.reserveStock(itemCode, quantity);

        if (!paymentProcessor.processPayment(accountId, price * quantity)) {
            System.out.println("Order Failed: Payment failed. Rolling back inventory...");
            inventoryService.releaseStock(itemCode, quantity);
            return false;
        }

        String trackingId = shippingService.arrangeShipping(itemCode, address);
        notificationService.sendOrderConfirmation(email, "Your order for " + itemCode + " was successful! Tracking: " + trackingId);

        System.out.println("--- Order Completed Successfully! ---\n");
        return true;
    }
}
