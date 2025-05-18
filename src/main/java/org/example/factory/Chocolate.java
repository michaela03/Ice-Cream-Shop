package org.example.factory;

import org.example.core.IceCream;

public class Chocolate implements IceCream {
    private String flavorName = "Chocolate Ice Cream";
    private double basePrice = 3.0;

    @Override
    public String getFlavor() {
        return flavorName;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}
