package com.pattern.facade;

public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder("ITEM-101", 2, 150.0, "ACC-12345", "Astana, Kazakhstan", "anuar@example.com");

        orderFacade.placeOrder("ITEM-102", 1, 1500.0, "ACC-12345", "Astana, Kazakhstan", "anuar@example.com");
    }
}
