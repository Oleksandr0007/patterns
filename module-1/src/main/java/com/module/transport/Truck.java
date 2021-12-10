package com.module.transport;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Truck implements Transport {
    private String licensePlate;
}
