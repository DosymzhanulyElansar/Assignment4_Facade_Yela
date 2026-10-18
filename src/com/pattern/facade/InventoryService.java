package com.pattern.facade;

public class InventoryService {
    public boolean checkStock(String itemCode, int quantity) {
        System.out.println("[InventoryService] Checking stock for " + itemCode + " (Quantity: " + quantity + ")...");
        return true; // Имитируем, что товар есть в наличии
    }

    public boolean reserveStock(String itemCode, int quantity) {
        System.out.println("[InventoryService] Reserved " + quantity + " unit(s) of " + itemCode + ".");
        return true;
    }

    public void releaseStock(String itemCode, int quantity) {
        System.out.println("[InventoryService] ROLLBACK: Released reserved stock for " + itemCode + ".");
    }
}