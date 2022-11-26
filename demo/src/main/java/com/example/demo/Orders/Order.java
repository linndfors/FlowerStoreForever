package com.example.demo.Orders;

import com.example.demo.Items.Item;

import java.util.LinkedList;

public class Order {
    public LinkedList<Item> getMyOrders() {
        return my_orders;
    }

    private final LinkedList<Item> my_orders = new LinkedList<>();
    private double whole_price = 0;

    private String payment_strategy = "";
    private String delivery_strategy = "";

//    public void setStatus(boolean status) {
//        this.status = status;
//    }

//    private boolean status = false;

    public void setPaymentStrategy(Payment payment) {
        if (payment instanceof CreditCardPaymentStrategy) {
            this.payment_strategy = "Credit Card Strategy";
        }
        else {
            this.payment_strategy = "Pay Pall Strategy";
        }
    }
    public void setDeliveryStrategy(Delivery delivery) {
        if (delivery instanceof DHLDeliveryStrategy) {
            this.delivery_strategy = "DHL Deliver Strategy";
        }
        else {
            this.delivery_strategy = "Post Deliver Strategy";
        }
    }
    public void calculateTotalPrice() {
        for(Item elem:my_orders) {
            this.whole_price += elem.price();
        }
    }

    public boolean processOrder() {
        return !this.delivery_strategy.equals("") & !this.payment_strategy.equals("");
    }
    public void addItem(Item new_item) {
        this.my_orders.add(new_item);
    }
    public void removeItem(Item this_item) {
        this.my_orders.remove(this_item);
    }
}
