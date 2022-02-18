package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    Farmer farmer = new Farmer("Tom");

    @Test
    public void shouldReturnFarmerIsPlowingOrNot() {
        assertEquals(false, farmer.isPlowing());
    }

}