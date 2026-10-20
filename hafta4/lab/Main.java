package lab;

public class Main {
    public static void main(String[] args) {

        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print("Sözleşme");

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        
        mfp.print("Sözleşme");
        
        String scannedDocument = mfp.scan("Belge");
        System.out.println("Taranan Belge: " + scannedDocument);

        mfp.fax("Sözleme","2345678");

        FakePrinter fakePrinter = new FakePrinter();

        fakePrinter.print("Sözleşme");
        fakePrinter.print("Sözleşme 2");
        System.out.println("Sözleşme: " + fakePrinter.printed());
    }
}