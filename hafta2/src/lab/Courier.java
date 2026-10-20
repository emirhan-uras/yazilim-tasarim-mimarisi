package lab;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private final String name;
    private final List<Shipment> shipments = new ArrayList<>();

    public Courier(String name) {
        this.name = name;
    }

    public void assign(Shipment shipment) {
        shipments.add(shipment);
    }

    public List<String> destinations() {
        List<String> cities = new ArrayList<>();
        for (Shipment s : shipments) {
            cities.add(s.destinationCity());
        }
        return cities;
    }

    public String name() {
        return name;
    }
}