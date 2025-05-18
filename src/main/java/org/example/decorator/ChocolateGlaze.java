package org.example.decorator;

import org.example.core.IceCream;

public class ChocolateGlaze extends AddOn {
    private double glazePrice = 0.7;

    public ChocolateGlaze(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getFlavor() {
        return iceCream.getFlavor() + " + Chocolate Glaze";
    }

    @Override
    public double getPrice() {
        return iceCream.getPrice() + glazePrice;
    }
}
