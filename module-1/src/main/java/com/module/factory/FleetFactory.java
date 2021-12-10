package com.module.factory;

import com.module.fleet.Fleet;
import com.module.transport.Transport;

public interface FleetFactory {
    Fleet getFleet(int capacity);
    Transport getTransport();
}
