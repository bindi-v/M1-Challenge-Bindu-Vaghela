package com.company.pointofsale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
    IceCream iceCream = new IceCream("chocolate", 2.50, 1);

    @Test
    public void shouldReturnIceCreamFlavour() {
        assertNotEquals("vanilla", iceCream.getFlavor());
    }

    @Test
    public  void shouldCheckPriceForIceCreamScoops() {
        assertEquals(2.5, iceCream.getPrice(), 0.001);
        
    }

    @Test
    public void testChooseContainer() {

        assertEquals("Waffle Cone", iceCream.chooseContainer("Waffle Cone"));
    }
}