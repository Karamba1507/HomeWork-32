package com.company;

import java.util.Objects;

public class Products {

    String name;
    double price;

    public Products(String name, double price) {
        this.name=name;
        this.price=price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products=(Products) o;
        return Double.compare(products.price, price) == 0 && name.equals(products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price=price;
    }
}
