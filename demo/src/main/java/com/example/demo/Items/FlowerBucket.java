package com.example.demo.Items;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> flowers;
    private double wholeprice = 0;
    public FlowerBucket() {
        this.flowers = new ArrayList<>();
    }
    public boolean search(Flower specialFlower, int quantity) {
        int counter = 0;
        for (FlowerPack my_flower:flowers) {
            if (my_flower.getFlower().getClass().equals(specialFlower.getClass())) {
                return true;
            }
        }
        return false;
        }
    public void addFlowers(FlowerPack pack) {
        flowers.add(pack);
    }
    public double price() {
        for (FlowerPack pack : flowers) {
            wholeprice += pack.getPrice();
        }
        return wholeprice;
    }

//    public static void main(String[] args) {
//        FlowerBucket buck = new FlowerBucket();
//        Chamomile fl1 = new Chamomile();
//        Cactus fl2 = new Cactus();
//        fl1.setPrice(34);
//        FlowerPack pck1 = new FlowerPack(fl1, 5);
//        buck.addFlowers(pck1);
//        System.out.println(buck.search(fl2, 5));
//    }
}
