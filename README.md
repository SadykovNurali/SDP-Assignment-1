# Event Ticketing System

Individual assignment on **Abstract Factory** and **Factory Method** design patterns for an Event Ticketing System.

##  Description
This project demonstrates how to dynamically create families of related products (Tickets and Passes) based on different event types (Concerts and Conferences).

##  File Structure
* `Ticket.java` — `Ticket` interface and concrete classes (`ConcertTicket`, `ConferenceTicket`).
* `EventPass.java` — `EventPass` interface and concrete classes (`ConcertPass`, `ConferenceBadge`).
* `EventFactory.java` — Abstract Factory interface.
* `ConcertFactory.java` — Concrete factory for concert products.
* `ConferenceFactory.java` — Concrete factory for conference products.
* `Main.java` — Main class demonstrating booking logic and input validation.

## Applied Clean Code Principles
1. **Meaningful Names:** Intent-revealing names for classes and methods.
2. **Validated Construction:** Throwing `IllegalArgumentException` when an invalid state (e.g., negative ticket price) is detected.
3. **Single Responsibility Principle (SRP):** Object creation logic is isolated from client execution.
4. **No Magic Values:** Clean conditional handling without hardcoded constants.
5. **Loose Coupling:** Client code depends on abstract interfaces (`EventFactory`, `Ticket`, `EventPass`), not concrete classes.