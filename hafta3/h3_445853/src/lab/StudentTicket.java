package lab;

public class StudentTicket implements TicketType{

    public String label() {
        return "Student Ticket";
    }

    public int price(int basePrice) {
        return basePrice * 6/10;
    }
}
