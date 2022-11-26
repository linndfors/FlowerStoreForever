package com.example.demo.Items;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Entity
@Table
public class Flower extends Item{
    @Id
    @SequenceGenerator(
            name = "flowers_sequence",
            sequenceName = "flowers_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "flowers_sequence"
    )
    Long id;
    String description;

    @Getter
    private double sepalLength;
    @Getter
    private FlowerType flowerType;
//    String description = super.description;
    private FlowerColor color;
    private double price;

    public Flower(String description, double sepalLength, FlowerType flowerType, FlowerColor color, double price) {
        this.description = description;
        this.sepalLength = sepalLength;
        this.flowerType = flowerType;
        this.color = color;
        this.price = price;
    }

    public Flower() {

    }


    public double getPrice() {
        return price;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    public String getColor() {
        return color.toString();
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "id='" + id + '\'' +
                "description='" + description + '\'' +
                ", sepalLength=" + sepalLength +
                ", flowerType=" + flowerType +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
