# Assignment 4: Facade Design Pattern

**Selected Option:** Option B — Online Order Processing Facade
**Student:** Anuar Yelansar  
**Group:** SE-2522  
**Language:** Java (JDK 17)  
**IDE:** IntelliJ IDEA

---

## 📌 Overview
This project implements the **Facade Structural Design Pattern** in Java based on **Option B: Online Order Processing Facade**.

The Facade pattern provides a unified, simplified interface (`OrderFacade`) to a complex subsystem comprising multiple collaborating services (`InventoryService`, `PaymentProcessor`, `ShippingService`, and `NotificationService`). It encapsulates subsystem orchestration, order placement logic, and rollback operations when steps fail.

---

## 🏗 Subsystem & Architecture

### Core Components:
1. **`InventoryService`**: Manages product stock checks, reservation, and stock release upon rollback.
2. **`PaymentProcessor`**: Handles transaction authorization and processing.
3. **`ShippingService`**: Schedules parcel delivery and generates tracking IDs.
4. **`NotificationService`**: Sends email confirmations to clients.
5. **`OrderFacade`**: The main Facade class exposing a simple `placeOrder(...)` method to clients.
6. **`Main`**: The client entry point that uses `OrderFacade` without directly instantiating or invoking subsystem classes.

---

## 💡 Clean Code Principles Applied

1. **Meaningful Names**: Method names like `placeOrder` and `reserveStock` clearly communicate intent.
2. **Single Responsibility Principle (SRP)**: `OrderFacade` orchestrates execution flow, leaving individual domain logic to respective services.
3. **Encapsulation / No Subsystem Leaks**: Subsystem details (e.g., tracking ID generation, stock checks) are completely hidden behind the Facade API.
4. **Small & Focused Classes**: Each service class has a single, well-defined task.
5. **Robust Error Handling & Rollback**: Built-in rollback functionality (e.g., releasing reserved stock if payment fails) ensures data consistency.

---

## 🚀 How to Run in IntelliJ IDEA

1. Clone or download this repository.
2. Open IntelliJ IDEA and select **File ➔ Open...**, then choose the project root folder.
3. Ensure **JDK 17** is configured under **File ➔ Project Structure ➔ Project**.
4. Navigate to `src/com/pattern/facade/Main.java`.
5. Right-click `Main.java` and select **Run 'Main.main()'**.