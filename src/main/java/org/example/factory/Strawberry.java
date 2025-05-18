package org.example.factory;

import org.example.core.IceCream;

public class Strawberry implements IceCream {
    private String flavorName = "Strawberry Ice Cream";
    private double basePrice = 2.8;

    @Override
    public String getFlavor() {
        return flavorName;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}
