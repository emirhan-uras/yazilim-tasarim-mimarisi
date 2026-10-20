package lab;

import java.util.ArrayList;
import java.util.List;

public class Shipment {

    private final String trackingNo;
    private final Customer receiver;
    private final List<Parcel> parcels = new ArrayList<>();

    public Shipment(String trackingNo, Customer receiver) {
        this.trackingNo = trackingNo;
        this.receiver = receiver;
    }

    public void addParcel(String label, int grams) {
        parcels.add(new Parcel(label,grams));
    }

    public List<Parcel> parcels() {
        return List.copyOf(parcels);
    }

    public int totalGrams() {
        int total = 0;
        for(Parcel p : parcels) {
            total += p.grams();
        }
        return total;
    }

    public String destinationCity() {
        return receiver.city();
    }

    public String trackingNo() {
        return trackingNo;
    }
}