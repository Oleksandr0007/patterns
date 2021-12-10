package com.module.transport;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ship implements Transport{
    private String name;

}
