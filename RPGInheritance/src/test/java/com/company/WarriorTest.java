package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    Warrior warrior = new Warrior("John");

    @Test
    public void shouldGetShieldStrength() {
       assertEquals(100, warrior.getShieldStrength());
    }
}