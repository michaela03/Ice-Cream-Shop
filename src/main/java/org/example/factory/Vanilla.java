package org.example.factory;

import org.example.core.IceCream;

public class Vanilla implements IceCream {
    private String flavorName = "Vanilla Ice Cream";
    private double basePrice = 2.5;

    @Override
    public String getFlavor() {
        return flavorName;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}
