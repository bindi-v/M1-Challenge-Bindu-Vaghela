package com.company;

import com.company.factory.IceCream;

public class IceCreamApp {
    public static void main(String[] args) {

        IceCream factoryIceCream = new IceCream("vanilla", 9.99, 5.99,  50, new String[]{"milk, sugar, vanilla extract"});

        System.out.println("Ice Cream from factory : ");
        System.out.println(factoryIceCream.toString());
        System.out.println("-----------------------------------------------------------------------");

        com.company.pointofsale.IceCream iceCream = new com.company.pointofsale.IceCream("chocolate", 2.5, 1);

        System.out.println("Ice Cream from point of sale : ");
        System.out.println(iceCream.toString());
    }
}
