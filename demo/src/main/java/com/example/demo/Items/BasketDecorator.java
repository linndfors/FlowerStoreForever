package com.example.demo.Items;

public class BasketDecorator extends ItemDecorator{
    private final Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return this.item.price() + 4;
    }

    @Override
    public double price() {
        return item.price();
    }
}
