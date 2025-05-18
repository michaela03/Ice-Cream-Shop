package org.example.decorator;

import org.example.core.IceCream;

public class ChocolateSticks extends AddOn {
    private double sticksPrice = 0.5;

    public ChocolateSticks(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getFlavor() {
        return iceCream.getFlavor() + " + Chocolate Sticks";
    }

    @Override
    public double getPrice() {
        return iceCream.getPrice() + sticksPrice;
    }
}
