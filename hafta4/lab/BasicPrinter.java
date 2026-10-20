package lab;

public class BasicPrinter implements Printer {
    
    @Override
    public void print(String doc) {
        System.out.println("Print: " + doc);
    }
}
