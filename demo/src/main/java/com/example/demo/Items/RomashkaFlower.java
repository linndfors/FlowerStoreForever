package com.example.demo.Items;

import static com.example.demo.Items.FlowerColor.BLUE;

public class RomashkaFlower extends Flower {

    public RomashkaFlower() {
        super();
    }

    public double price() {
        return this.getPrice();
    }
//    public static void main() {
//        Flower flower_one = new RomashkaFlower();
//        flower_one.setDescription("This is the most beautiful romashka in the whole world");
//        flower_one.setPrice(102);
//        flower_one.setColor(BLUE);
//        flower_one.setSepalLength(204);
//        System.out.println(flower_one);
//    }
}
