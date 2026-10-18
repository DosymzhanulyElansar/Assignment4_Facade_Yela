package com.pattern.facade;

public class ShippingService {
    public String arrangeShipping(String itemCode, String destinationAddress) {
        String trackingId = "TRK-" + (int)(Math.random() * 90000 + 10000);
        System.out.println("[ShippingService] Parcel with " + itemCode + " scheduled to " + destinationAddress + ". Tracking ID: " + trackingId);
        return trackingId;
    }

    public void cancelShipping(String trackingId) {
        System.out.println("[ShippingService] ROLLBACK: Canceled shipment " + trackingId + ".");
    }
}