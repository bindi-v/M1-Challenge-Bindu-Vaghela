package com.company.pointofsale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
    IceCream iceCream = new IceCream("vanilla", 2.50, 1);

    @Test
    public void shouldReturnIceCreamFlavour() {
        assertEquals("vanilla", iceCream.getFlavor());
    }

    public  void shouldReturnPriceForIceCreamScoops() {
        assertEquals(5.0, iceCream.scoop(2));
        
    }
}