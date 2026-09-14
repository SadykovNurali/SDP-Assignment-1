# Assignment 1 — Builder Pattern: Event Ticket System

## Project Description
This project demonstrates the Builder creational design pattern in Java to construct `EventTicket` objects step-by-step.
It supports method chaining (fluent API), preset configurations managed by `TicketDirector`, and validation during creation.

---

## Clean Code Principles Applied

1. **Meaningful, Intention-Revealing Names**
    * **Before:** `boolean ft;`, `void setS(String s)`
    * **After:** `boolean hasFastTrack;`, `public Builder setSeatNumber(String seatNumber)`
    * **Justification:** Clear variable and method names make the code self-documenting and easy to maintain.

2. **Validated Construction**
    * **Before:** Allowing the creation of tickets with missing or negative prices.
    * **After:**
      ```java
      if (price <= 0) {
          throw new IllegalStateException("Price must be greater than zero");
      }
      ```
    * **Justification:** Ensures that invalid objects are never instantiated and fails early with clear exception messages.

3. **No Magic Numbers**
    * **Before:** `setPrice(basePrice * 1.5)`
    * **After:** `private static final double VIP_MULTIPLIER = 1.5;`
    * **Justification:** Explains the business logic behind values and centralizes constants in one place.

4. **Small Methods & Single Responsibility**
    * **Before:** Pass all 7 arguments directly into a long constructor.
    * **After:** Each builder method handles setting a single attribute and returns `this`.
    * **Justification:** Simplifies reading, testing, and parameter configuration.

5. **Fluent API (Method Chaining)**
    * **Before:** Separate setter calls across multiple lines without returning state.
    * **After:**
      ```java
      new EventTicket.Builder()
          .setEventName("Music Festival")
          .setSeatNumber("Zone-B")
          .setPrice(45.0)
          .build();
      ```
    * **Justification:** Creates a clean, readable construction pipeline when instantiating complex objects.