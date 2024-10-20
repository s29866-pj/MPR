package org.example;
public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria("Wow", "Prosto");
        Pizza pizza = new Pizza("Margaritha", 30, 13);

        System.out.println(pizzeria.getPlace());
    }
}