package lab;

import java.util.List;
import java.util.ArrayList; 

public class FakePrinter implements Printer{
    
    private final List<String> printed = new ArrayList<>();

    @Override 
    public void print(String doc) {
        System.out.println("Print: " + doc);
    }

    public List<String> printed() {
        return List.copyOf(printed);
    }
}