package com.example.demo.Items;

public class RibbonDecorator extends ItemDecorator{
    private final Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return this.item.price() + 40;
    }

    @Override
    public double price() {
        return item.price();
    }
}
