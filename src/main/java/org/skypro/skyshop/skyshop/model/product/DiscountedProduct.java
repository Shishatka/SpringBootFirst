package org.skypro.skyshop.skyshop.model.product;

import java.util.UUID;

public class DiscountedProduct extends Product {

    private int price;
    private double discount;

    public DiscountedProduct(UUID id, String name, int price, double discount) {
        super(name, id);
        this.price = price;
        this.discount = discount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return (int) (price * (discount/100));
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + " " + (int) discount + "%: " + getPrice() + " " + (int) discount + "%";
    }
}
