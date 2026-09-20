
public class Main {

    public static void bookEvent(EventFactory factory, String title, double price, String userName) {
        Ticket ticket = factory.createTicket(title, price);
        EventPass pass = factory.createPass(userName);

        ticket.printDetails();
        pass.printDetails();
    }

    public static void main(String[] args) {
        try {
            EventFactory concertFactory = new ConcertFactory();
            bookEvent(concertFactory, "Rock Festival 2026", 120.0, "Nur");

            EventFactory conferenceFactory = new ConferenceFactory();
            bookEvent(conferenceFactory, "Java Tech Conf", 250.0, "Ali");

            concertFactory.createTicket("Error Event", -10.0);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}