package com.example.demo.Controlers;

import com.example.demo.Items.Flower;
import com.example.demo.Items.Item;
import com.example.demo.Items.RomashkaFlower;
import com.example.demo.Orders.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.demo.Items.FlowerColor.BLUE;


@RestController
@RequestMapping(path = "/order")
public class OrderController {
    @GetMapping
    public List<Item> getFlowers() {
        Flower flower_one = new RomashkaFlower();
        flower_one.setDescription("This is the most beautiful romashka in the whole world");
        flower_one.setPrice(102);
        flower_one.setColor(BLUE);
        flower_one.setSepalLength(204);
        System.out.println(flower_one);

        Order order = new Order();
        order.addItem(flower_one);
        List<Item> example = order.getMyOrders();
        order.setPaymentStrategy(new CreditCardPaymentStrategy());
        order.setDeliveryStrategy(new PostDeliveryStrategy());
        if (order.processOrder()) {
            System.out.println("Your orders:");
            return example;
        }
        System.out.println("Can't process the order");
        return List.of();
    }
}
