import java.lang.module.ModuleReader;

public class Main {

    static String diningSet(FurnitureFactory factory){
        Chair chair = factory.createChair();
        Table table = factory.createTable();

        return "Takım: " + chair.describe() + " + " + table.describe();
    }
    public static void main(String[] args) {
        
        Showroom ms = new ModernShowroom();
        Showroom cs = new ClassicShowroom();

        System.out.println("Vitrin: " + ms.display());
        System.out.println("Vitrin: " + cs.display());


        FurnitureFactory mf = new ModernFactory();
        FurnitureFactory cf = new ClassicFactory();
        
        System.out.println(diningSet(mf));
        System.out.println(diningSet(cf));
    }
}