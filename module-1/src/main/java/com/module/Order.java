package com.module;

import com.module.fleet.Fleet;
import lombok.Data;

@Data
public class Order {
    private String product;
    private Route route;
    private Fleet fleet;

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    public static class OrderBuilder {
        Order order;

        public OrderBuilder() {
            order = new Order();
        }

        public OrderBuilder withProduct(String product) {
            order.product = product;
            return this;
        }

        public OrderBuilder withRoute(Route route) {
            order.route = route;
            return this;
        }

        public OrderBuilder withFleet(Fleet fleet) {
            order.fleet = fleet;
            return this;
        }

        public Order build() {
            return order;
        }
    }

}
