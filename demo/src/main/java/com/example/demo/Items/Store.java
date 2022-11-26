package com.example.demo.Items;

import java.util.ArrayList;

public class Store {
    private ArrayList<Flower> flowers;
    public Store() {
        this.flowers = new ArrayList<>();
    }
    public void add(Flower flower) {
        this.flowers.add(flower);
    }
    public int search(Flower specialFlower) {
        int counter = 0;
        for (Flower flower:flowers) {
            if (flower.getColor().equals(specialFlower.getColor())) {
                if (flower.getPrice() == specialFlower.getPrice()) {
                    if (flower.getSepalLength()
                           == specialFlower.getSepalLength()) {
                        counter += 1;
                    }
                }
            }
        }
        return counter;
    }
}

