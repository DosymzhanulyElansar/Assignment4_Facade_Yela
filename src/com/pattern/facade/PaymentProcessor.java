package com.pattern.facade;

public class PaymentProcessor {
    public boolean processPayment(String accountId, double amount) {
        System.out.println("[PaymentProcessor] Processing payment of $" + amount + " for account " + accountId + "...");
        if (amount > 1000.0) {
            System.out.println("[PaymentProcessor] Payment declined: Insufficient funds or limit exceeded.");
            return false;
        }
        System.out.println("[PaymentProcessor] Payment successful!");
        return true;
    }
}