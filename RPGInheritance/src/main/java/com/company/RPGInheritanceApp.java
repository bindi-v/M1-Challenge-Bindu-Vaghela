package com.company;

public class RPGInheritanceApp {
    public static void main(String[] args) {

        Farmer farmer = new Farmer();
        Constable constable = new Constable();
        Warrior warrior = new Warrior();

        farmer.plow();
        farmer.harvest();

        constable.arrest(warrior);
        constable.getJurisdiction();

        warrior.decreaseShieldStrength(90);
        warrior.getShieldStrength();

    }
}
