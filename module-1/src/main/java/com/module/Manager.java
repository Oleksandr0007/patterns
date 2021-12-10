package com.module;

import com.module.fleet.Fleet;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class Manager {
    private String fullName;
    private final Set<Order> orders;

    public Manager(String fullName) {
        this.fullName = fullName;
        orders = new HashSet<>();
    }

    public Order createOrder(String product, Route route, Fleet fleet) {
        Order order = Order.builder()
                .withProduct(product)
                .withFleet(fleet)
                .withRoute(route)
                .build();
        orders.add(order);
        return order;
    }

    public void completeOrder(Order order) {
        orders.remove(order);
    }
}
