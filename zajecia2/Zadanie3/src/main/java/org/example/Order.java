package org.example;

public class Order{
    int ID;
    String name;

    public Order(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
}
