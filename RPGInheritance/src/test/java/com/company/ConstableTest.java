package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
    Constable constable = new Constable("Jerry", "DownTown");
    Farmer farmer = new Farmer("Tom");
    @Test
    public void getJurisdiction() {
        
        assertEquals("DownTown", constable.getJurisdiction());
    }

}