package org.example;

public class Pizza {
    String name;
    int price;
    int size;

    public Pizza(String name, int price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public Pizza() {
        this.name = getName();
    }

    public int getPrice() {
        return price;
    }
    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setName(String name) {
        this.name = name;
    }
}
