# 🏦 Banking System – Facade Design Pattern (Java)

## 📖 Overview

This project demonstrates the **Facade Design Pattern** using a **Banking System** example in Java.  
The Facade pattern provides a **simplified interface** to a complex system consisting of multiple classes such as security, account
verification, funds management, and transaction logging.

---

## 🎯 Problem Statement

In a typical banking scenario, withdrawing money involves multiple steps:

- Account verification
- Security authentication (PIN validation)
- Funds availability check
- Transaction logging

Instead of exposing these complexities to the client, the **BankingFacade** wraps all these subsystems behind a simple method
`withdrawMoney()`.

---

## 🧩 Components

| Class                | Responsibility                                   |
|----------------------|--------------------------------------------------|
| `AccountService`     | Verifies if the account is active                |
| `SecurityService`    | Validates the user PIN                           |
| `FundsService`       | Checks balance and debits money                  |
| `TransactionService` | Logs the transaction                             |
| `BankingFacade`      | Simplifies access by wrapping all above services |
| `BankingApp`         | Client class that interacts only with the Facade |

---

## 🚀 How to Run

Compile all Java files:

```bash
   javac *.java
```

---

## 📄 Documentation

For detailed explanation and diagrams, refer to this Google Doc:  
🔗 [Facade Design Pattern - Banking Project Notes](https://docs.google.com/document/d/1ga0ufnN0_Q2yqzQB_WPuNcIQ9Cj-DXamKv2B-XVGey4/edit?tab=t.c0xc69wbfps5#heading=h.w3vyb0fs4h8j)

---
