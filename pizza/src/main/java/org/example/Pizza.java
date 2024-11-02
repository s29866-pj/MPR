package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pizza {
    private String size;
    private List<String> toppings;
    private double basePrice;
    private static final Map<String, Double> SIZES = new HashMap<>() {{
        put("SMALL", 10.99);
        put("MEDIUM", 13.99);
        put("LARGE", 16.99);
    }};
    private static final double TOPPING_PRICE = 1.50;

    public Pizza(String size) {
        this.size = size.toUpperCase();
        this.toppings = new ArrayList<>();
        this.basePrice = SIZES.get(this.size);
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public double calculateTotal() {
        return basePrice + (toppings.size() * TOPPING_PRICE);
    }

    public List<String> getToppings() {
        return toppings;
    }

    public String getSize() {
        return size;
    }
}


