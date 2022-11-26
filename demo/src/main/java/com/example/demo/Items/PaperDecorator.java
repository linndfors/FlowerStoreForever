package com.example.demo.Items;

public class PaperDecorator extends ItemDecorator{
    private final Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return this.item.price() + 13;
    }

    @Override
    public double price() {
        return item.price();
    }
}
