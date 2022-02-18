package com.company;

public class Farmer extends Character {

    private boolean plowing;
    private boolean harvesting;

    public Farmer(String name) {
        super(name, 75, 100, 75, 10, 1);
//        this.plowing = true;
//        this.harvesting = true;
    }

    public void plow() {
        System.out.println("Farmer Plowing...");
    }

    public void harvest() {
        System.out.println("Farmer Harvesting...");
    }

}
