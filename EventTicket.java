public class EventTicket {

    private String eventName;
    private String venue;
    private String seat;
    private String ticketType;
    private boolean parking;
    private boolean foodVoucher;

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public void setFoodVoucher(boolean foodVoucher) {
        this.foodVoucher = foodVoucher;
    }

    @Override
    public String toString() {
        return "EventTicket{" +
                "\n  Event: " + eventName +
                "\n  Venue: " + venue +
                "\n  Seat: " + seat +
                "\n  Ticket Type: " + ticketType +
                "\n  Parking: " + parking +
                "\n  Food Voucher: " + foodVoucher +
                "\n}";
    }
}