
public interface EventFactory {
    Ticket createTicket(String title, double price);
    EventPass createPass(String ownerName);
}