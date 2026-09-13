public interface TicketBuilder {

    TicketBuilder setEventName(String eventName);

    TicketBuilder setVenue(String venue);

    TicketBuilder setSeat(String seat);

    TicketBuilder setTicketType(String ticketType);

    TicketBuilder setParking(boolean parking);

    TicketBuilder setFoodVoucher(boolean foodVoucher);

    EventTicket build();
}