
public class ConferenceFactory implements EventFactory {
    @Override
    public Ticket createTicket(String title, double price) {
        return new ConferenceTicket(title, price);
    }

    @Override
    public EventPass createPass(String ownerName) {
        return new ConferenceBadge(ownerName);
    }
}