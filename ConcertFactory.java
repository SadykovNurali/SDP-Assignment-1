public class ConcertFactory implements EventFactory {
    @Override
    public Ticket createTicket(String title, double price) {
        return new ConcertTicket(title, price);
    }

    @Override
    public EventPass createPass(String ownerName) {
        return new ConcertPass(ownerName);
    }
}