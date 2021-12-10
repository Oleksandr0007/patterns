package com.module.factory;

import com.module.fleet.SeaFleet;
import com.module.transport.Ship;

public class SeaFleetFactory implements FleetFactory {
    int fleetNum;
    int shipNum;

    @Override
    public SeaFleet getFleet(int capacity) {
        SeaFleet seaFleet = new SeaFleet("Sea fleet #" + fleetNum++);
        for (int i = 0; i < capacity; i++) {
            seaFleet.addTransport(getTransport());
        }
        return seaFleet;
    }

    @Override
    public Ship getTransport() {
        return new Ship("HMS. Porxima "+shipNum++);
    }
}
