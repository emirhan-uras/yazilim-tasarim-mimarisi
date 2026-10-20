package lab;

public class OfficeService {
    
    Printer printer;
    DocumentScanner scanner;

    public OfficeService (Printer printer, DocumentScanner scanner) {
        setPrinter(printer);
        setScanner(scanner);
    }


    public void setPrinter(Printer printer) { this.printer = printer; }

    public void setScanner(DocumentScanner scanner) { this.scanner = scanner; }

    public void copy(String paper, int copies) {
        String doc = scanner.scan(paper); 
        printer.print(doc);
    }
}
