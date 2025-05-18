package org.example.decorator;

import org.example.core.IceCream;

public abstract class AddOn implements IceCream {
    protected IceCream iceCream;

    public AddOn(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getFlavor() {
        return iceCream.getFlavor();
    }

    @Override
    public double getPrice() {
        return iceCream.getPrice();
    }
}
