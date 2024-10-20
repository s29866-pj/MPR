package org.example;

import org.example.pizza.Marg;
import org.example.pizza.Ciasto;

import java.util.ArrayList;

class Pizzeria extends org.example.Pizza {
    String name;
    String place;
    ArrayList<Ciasto> pizzaList = new ArrayList<>();



    public Pizzeria(String name, String place) {
        super();
        this.name = name;
        this.place = place;
        pizzaList.add(new Marg());
    }

    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getName() {
        return name;
    }
}

