package com.company.pointofsale;

import java.util.Objects;

public class IceCream {

    private String flavor;
    private double price;
    private int quantity;
    private String topping;
    private String iceCreamContainer;

    public IceCream(String flavor, double price, int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    public String chooseContainer(String iceCreamContainer) {
        this.iceCreamContainer = iceCreamContainer;
        return this.iceCreamContainer;
    }
    public void addToppings(String topping) {
        System.out.println("Toppings added on Ice Cream!!");
        this.topping = topping;
    }

    public double scoop(int scoops) {
        this.price -= scoops * this.price;
        System.out.format("The price will be %f dollars!", price * scoops );
        return this.price;
    }

    public void sampleIceCream() {
        this.quantity--;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.price, price) == 0 && quantity == iceCream.quantity && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, price, quantity);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
