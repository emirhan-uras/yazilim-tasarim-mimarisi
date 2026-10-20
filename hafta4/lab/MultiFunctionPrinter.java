package lab;

public class MultiFunctionPrinter implements Printer, DocumentScanner, FaxMachine{

   @Override
    public void print(String doc) {
        System.out.println("Print: " + doc);
    }

    @Override 
    public String scan(String paper) {
        return paper;
    }

    @Override 
    public void fax(String doc, String number) {
        System.out.println("Number: " + number + "Fax: " + doc);
    }
}
