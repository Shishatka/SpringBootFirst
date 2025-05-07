package org.skypro.skyshop.model.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.skypro.skyshop.model.search.Searchable;

import java.util.UUID;

public abstract class Product implements Searchable {
    private String name;
    private final UUID id;

    @JsonIgnore
    public String getSearchTerm(){
        return name;
    }
    @JsonIgnore
    public String getContentType(){
        return "PRODUCT";
    }

    public Product(String name, UUID id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public UUID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getPrice();

    //public abstract void setPrice(int price);

    public String toString(Product product) {
        return name + " имя.";
    }

    public abstract boolean isSpecial();

}
