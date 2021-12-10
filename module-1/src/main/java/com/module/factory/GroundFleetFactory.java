package com.module.factory;

import com.module.fleet.GroundFleet;
import com.module.transport.Truck;

public class GroundFleetFactory implements FleetFactory {
    int transportNum;
    int fleetNum;

    @Override
    public GroundFleet getFleet(int capacity) {
        GroundFleet groundFleet = new GroundFleet("Ground fleet #" + fleetNum++);
        for (int i = 0; i < capacity; i++) {
            groundFleet.addTransport(getTransport());
        }
        return groundFleet;
    }

    @Override
    public Truck getTransport() {
        return new Truck("AA" + (transportNum++) + "BC");
    }
}
