package com.module.fleet;

import com.module.transport.Transport;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.*;

@Data
public abstract class Fleet {
    private String name;
    @Setter(AccessLevel.NONE)
    private Set<Transport> trucks;

    public Fleet(String name) {
        this.name = name;
        trucks = new HashSet<>();
    }

    public void addTransport(Transport transport) {
        trucks.add(transport);
    }

    public void removeTransport(Transport transport) {
        trucks.remove(transport);
    }

    public Set<Transport> getAllTransport() {
        return Collections.unmodifiableSet(trucks);
    }
}
