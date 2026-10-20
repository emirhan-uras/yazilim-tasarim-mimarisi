package lab;

public class Main {
    public static void main(String[] args) {

        Address a1 = new Address("İzmir","Bornova");
        Address a2 = new Address("Ankara","Çankaya");

        Customer c1 = new Customer("Ali Kaya",a1);
        Customer c2 = new Customer("Elif Demir",a2);

        Shipment s1 = new Shipment("KG-1001",c1);
        Shipment s2 = new Shipment("KG-1002",c2);

        s1.addParcel("Kitap",1200);
        s1.addParcel("Kupa",400);

        s2.addParcel("Laptop",2500);

        Courier k1 = new Courier("Mert");

        k1.assign(s1);
        k1.assign(s2);

        System.out.println(s1.trackingNo() + ": " + s1.destinationCity() + ", " + s1.parcels().size() + " koli, " + s1.totalGrams() + " g");

        System.out.println(k1.name() + " rotası: " + k1.destinations());

        System.out.println("Aynı adres mi? " + c1.address().equals(new Address("İzmir", "Bornova")));

        try {
            s1.parcels().clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("Hata: koli listesi dışarıdan değiştirilemez!");
        }

        try {
            s2.addParcel("Laptop",0);
        } catch(IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}