package lab;

public class TicketPrinter {

    public void print(Ticket ticket) {
        System.out.println("-----[Bilet]-----");
        System.out.println("Film  : " + ticket.film());
        System.out.println("Tür   : " + ticket.type());
        System.out.println("Fiyat : " + ticket.price());
    }
}
