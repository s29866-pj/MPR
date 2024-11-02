package org.example;

import java.util.ArrayList;
import java.util.List;

class Restaurant {
    private final String name;
    List<Pizza> orders;

    public Restaurant(String name, String address) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Pizza pizza) {
        orders.add(pizza);
    }

    public double getTotalOrdersValue() {
        return orders.stream().mapToDouble(Pizza::calculateTotal).sum();
    }

    public String getName() {
        return name;
    }
}
