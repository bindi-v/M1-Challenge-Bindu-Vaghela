package com.company.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
IceCream factoryIceCream = new IceCream("vanilla", 9.99, 5.99, 50, new String[]{"milk", "sugar", "vanilla extract"});
    @Test
    public void shouldReturnIceCreamFlavor() {
    assertEquals("vanilla", factoryIceCream.getFlavor());
    }

    @Test
    public void shouldReturnSetFlavor() {
        factoryIceCream.setFlavor("chocolate");
        assertNotEquals("vanilla", factoryIceCream.getFlavor());
    }

    @Test
    public void shouldReturnSetSalePrice() {
        factoryIceCream.setSalePrice(9.99);
        assertEquals(9.99, factoryIceCream.getSalePrice(), 0.001);
    }

    @Test
    public void shouldReturnSetProductionCost() {
        factoryIceCream.getProductionCost();
        assertEquals(5.99, factoryIceCream.getProductionCost(), 0.001);
    }

    @Test
    public void shouldReturnSetProductionTime() {
        assertEquals(50, factoryIceCream.getProductionTime(), 0.001);
    }

    @Test
    public void shouldReturnSetIngredients() {
        //System.out.println(factoryIceCream.getIngredients()[0]);
        assertNotEquals("failed message", "cocoa, sugar, vanilla extracts", factoryIceCream.getIngredients());
    }
}