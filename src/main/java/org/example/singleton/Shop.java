package org.example.singleton;

import org.example.core.IceCream;
import org.example.factory.IceCreamFactory;

public class Shop {
    private static Shop instance;

    private Shop() {}

    public static Shop getShop() {
        if (instance == null) {
            instance = new Shop();
        }
        return instance;
    }

    public IceCream order(String type) {
        return IceCreamFactory.makeIceCream(type);
    }
}
