public class ConcertTicketBuilder implements TicketBuilder {

    private EventTicket ticket = new EventTicket();

    @Override
    public TicketBuilder setEventName(String eventName) {
        ticket.setEventName(eventName);
        return this;
    }

    @Override
    public TicketBuilder setVenue(String venue) {
        ticket.setVenue(venue);
        return this;
    }

    @Override
    public TicketBuilder setSeat(String seat) {
        ticket.setSeat(seat);
        return this;
    }

    @Override
    public TicketBuilder setTicketType(String ticketType) {
        ticket.setTicketType(ticketType);
        return this;
    }

    @Override
    public TicketBuilder setParking(boolean parking) {
        ticket.setParking(parking);
        return this;
    }

    @Override
    public TicketBuilder setFoodVoucher(boolean foodVoucher) {
        ticket.setFoodVoucher(foodVoucher);
        return this;
    }

    @Override
    public EventTicket build() {
        return ticket;
    }
}