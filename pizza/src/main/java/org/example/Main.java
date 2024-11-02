package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



class PizzaOrderingApp {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Pizza Palace", "123 Main St");

        Pizza pizza1 = new Pizza("LARGE");
        pizza1.addTopping("Pepperoni");
        pizza1.addTopping("Mushrooms");
        pizza1.addTopping("Extra Cheese");

        Pizza pizza2 = new Pizza("MEDIUM");
        pizza2.addTopping("Chicken");
        pizza2.addTopping("Bell Peppers");

        restaurant.addOrder(pizza1);
        restaurant.addOrder(pizza2);

        System.out.println("Welcome to " + restaurant.getName() + "!");
        System.out.println("\nOrder Summary:");

        int orderNum = 1;
        for (Pizza pizza : restaurant.orders) {
            System.out.println("\nPizza #" + orderNum++);
            System.out.println("Size: " + pizza.getSize());
            System.out.println("Toppings: " + String.join(", ", pizza.getToppings()));
            System.out.printf("Price: $%.2f%n", pizza.calculateTotal());
        }

        System.out.printf("\nTotal Order Value: %.2f%n", restaurant.getTotalOrdersValue());
    }
}