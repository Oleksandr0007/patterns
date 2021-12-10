package com.module;

import com.module.factory.FleetFactory;
import com.module.factory.GroundFleetFactory;
import com.module.factory.SeaFleetFactory;
import com.module.fleet.Fleet;

public class Main {
    public static void main(String[] args) {
        FleetFactory fleetFactory = new GroundFleetFactory();
        Fleet fleet = fleetFactory.getFleet(3);
        Route route = new Route("Lviv","Kair");
        Manager manager = new Manager("Arkadiy Dobkin");
        System.out.println(manager.createOrder("bubble gum",route,fleet));
    }
}
