package com.example.demo.Orders;

import com.example.demo.Items.Item;

public interface Delivery {

    public default void deliver(Order items) {
    }
}
