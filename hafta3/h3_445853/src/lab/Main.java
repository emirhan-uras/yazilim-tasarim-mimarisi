package lab;

public class Main {
    public static void main(String[] args) {

        FullTicket ft = new FullTicket();
        ft.label();
        ft.price(200);

        StudentTicket st1 = new StudentTicket();
        st1.label();
        st1.price(200);

        ChildTicket ct = new ChildTicket();
        ct.label();
        ct.price(200);
    }
}