package lab;

public class ChildTicket implements TicketType{

    public String label() {
        return "Child Ticket";
    }

    public int price(int basePrice) {
        return basePrice / 2;
    }
}
