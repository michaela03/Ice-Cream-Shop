package org.example.factory;

import org.example.core.IceCream;

public class IceCreamFactory {
    public static IceCream makeIceCream(String type) {
        switch (type.toLowerCase()) {
            case "vanilla": return new Vanilla();
            case "chocolate": return new Chocolate();
            case "strawberry": return new Strawberry();
            default:
                throw new IllegalArgumentException("Unknown ice cream type: " + type);
        }
    }
}
