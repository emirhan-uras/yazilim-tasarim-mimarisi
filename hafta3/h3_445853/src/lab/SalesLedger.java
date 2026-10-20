package lab;

import java.util.ArrayList;
import java.util.List;

public class SalesLedger {

    private List<Ticket> tickets = new ArrayList<>();

    public void add(Ticket ticket) {
        tickets.add(ticket);
    }

    public int count() {
        return tickets.size();
    }

    public int total() {
        int sum = 0;
        for (Ticket t : tickets) {
            sum += t.price();
        }
        return sum;
    }
}
