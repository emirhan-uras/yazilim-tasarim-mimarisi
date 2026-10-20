package lab;

public class Main {
    public static void main(String[] args) {

        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print("Sözleşme");

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print("Sözleşme");
        mfp.scan("Belge");
        mfp.fax("Sözleme","2345678");

        FakePrinter fakePrinter = new FakePrinter();

        System.out.println("Sözleşme: " + fakePrinter.printed());
    }
}