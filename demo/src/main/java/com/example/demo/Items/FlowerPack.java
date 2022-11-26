package com.example.demo.Items;

public class FlowerPack {
    private int quantity;
    private Flower flower;
    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
    public Flower getFlower() {
        return this.flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        double sum = this.flower.getPrice() * this.quantity;
        return sum;
    }

}
