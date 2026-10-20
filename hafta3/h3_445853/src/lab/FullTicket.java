package lab;

public class FullTicket implements TicketType{

    public String label() {
        return "Full Ticket";
    }

    public int price(int basePrice) {
        return basePrice;
    }
}
