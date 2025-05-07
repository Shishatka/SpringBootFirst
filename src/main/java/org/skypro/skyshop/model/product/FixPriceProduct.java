package org.skypro.skyshop.model.product;

import java.util.UUID;

public class FixPriceProduct extends Product {

    private final int PRICE = 1000;

    public FixPriceProduct(UUID id, String name) {
        super(name, id);
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    public String toString() {
        return getName() + " " + PRICE + ": " + PRICE;
    }
}
