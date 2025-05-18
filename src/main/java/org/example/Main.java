package org.example;

import org.example.core.IceCream;
import org.example.decorator.ChocolateGlaze;
import org.example.decorator.ChocolateSticks;
import org.example.singleton.Shop;

public class Main {
    public static void main(String[] args) {
        Shop myShop = Shop.getShop();

        IceCream iceCream1 = myShop.order("vanilla");
        iceCream1 = new ChocolateGlaze(iceCream1);
        iceCream1 = new ChocolateSticks(iceCream1);

        System.out.println("Flavor: " + iceCream1.getFlavor());
        System.out.println("Price: " + iceCream1.getPrice() + " lv");

        IceCream iceCream2 = myShop.order("chocolate");
        iceCream2 = new ChocolateSticks(iceCream2);

        System.out.println("Flavor: " + iceCream2.getFlavor());
        System.out.println("Price: " + iceCream2.getPrice() + " lv");
    }
}
