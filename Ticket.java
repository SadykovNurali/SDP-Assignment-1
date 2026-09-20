
public interface Ticket {
    void printDetails();
}

class ConcertTicket implements Ticket {
    private String name;
    private double price;

    public ConcertTicket(String name, double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.name = name;
        this.price = price;
    }

    @Override
    public void printDetails() {
        System.out.println("Ticket " + name + " | Price $" + price);
    }
}

class ConferenceTicket implements Ticket {
    private String name;
    private double price;

    public ConferenceTicket(String name, double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative!");
        this.name = name;
        this.price = price;
    }

    @Override
    public void printDetails() {
        System.out.println("Conference Ticket " + name + " | Price $" + price);
    }
}