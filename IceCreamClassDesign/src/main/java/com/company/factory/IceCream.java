package com.company.factory;

import java.util.Arrays;
import java.util.Objects;

public class IceCream {

    private String flavor;
    private double salePrice;
    private double productionCost;
    private int productionTime;
    private String[] ingredients;


    public IceCream(String flavor, double salePrice, double productionCost, int productionTime, String[] ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    public void IceCreamFlavor(double quantity) {
        System.out.format("%d gallons of %s Ice Cream will take %d hours to produce%n", flavor, quantity, productionTime * quantity);
        System.out.format("Ice Cream will cost %.2f to produce and sold at %.2f %n", productionCost * quantity, salePrice * quantity);

    }

    // Getters and Setters

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public double getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    // Equals and Hash

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.salePrice, salePrice) == 0 && Double.compare(iceCream.productionCost, productionCost) == 0 && Double.compare(iceCream.productionTime, productionTime) == 0 && Objects.equals(flavor, iceCream.flavor) && Objects.equals(ingredients, iceCream.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlavor(), getSalePrice(), getProductionCost(), getProductionTime(), getIngredients());
    }

    // ToString

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", salePrice=" + salePrice +
                ", productionCost=" + productionCost +
                ", productionTime=" + productionTime +
                ", ingredients=" + Arrays.toString(ingredients) +
                '}';
    }
}


