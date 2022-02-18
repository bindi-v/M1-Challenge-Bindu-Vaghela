package com.company;

public class RPGInheritanceApp {
    public static void main(String[] args) {

        Farmer farmer = new Farmer("Tom");
        Constable constable = new Constable("Jerry","DownTown");
        Warrior warrior = new Warrior("John");

        farmer.isPlowing();
        farmer.isHarvesting();
      //  farmer.attackPower;

        constable.arrest(warrior);
        constable.getJurisdiction();

        warrior.setShieldStrength(90);
        warrior.getShieldStrength();

        warrior.attackCharacter(constable);

    }
}
