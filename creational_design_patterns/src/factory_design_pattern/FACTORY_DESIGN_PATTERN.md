# 🏦 Factory Design Pattern - Banking Project Example

This project demonstrates the use of the **Factory Design Pattern** in a real-world banking scenario. The Factory Pattern is a creational pattern used to create objects without exposing the instantiation logic to the client.

---

## 📌 What is the Factory Design Pattern?

The Factory Design Pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

Instead of using `new` directly, the client calls a factory method, which handles object creation.

---

## 📘 Real-World Analogy

Imagine a **Bank ATM**:
- You insert your card (Debit/Credit/Prepaid).
- Based on the card type, the ATM internally determines which service handler to use.
- You don't need to know the logic — the ATM (factory) figures it out for you.

---

## 🧱 Project Structure

```bash
src/
├── Main.java
├── BankService.java         # Interface for all services
├── AccountService.java      # Concrete implementation for Account creation
├── LoanService.java         # Concrete implementation for Loan processing
├── CreditCardService.java   # Concrete implementation for Credit Card application
└── BankServiceFactory.java  # Factory class for service creation
```
---

## 📄 Documentation
For detailed explanation and diagrams, refer to this Google Doc:  
🔗 [Factory Design Pattern - Banking Project Notes](https://docs.google.com/document/d/1ga0ufnN0_Q2yqzQB_WPuNcIQ9Cj-DXamKv2B-XVGey4/edit?tab=t.c0xc69wbfps5)

---