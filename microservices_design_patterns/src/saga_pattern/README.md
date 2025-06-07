# 🔄 Saga Pattern in Spring Boot – Real-World Banking Example

## 📘 Overview

The **Saga Pattern** is used in microservices to manage **distributed transactions** and ensure **eventual consistency**. Instead of a
single global transaction, a saga splits a business process into a sequence of local transactions, each with **compensating logic** in case
of failure.

This project demonstrates both:

- ✅ **Choreography-based Saga** (Event-driven)
- ✅ **Orchestration-based Saga** (Central coordinator)

---

## 🏦 Use Case: Money Transfer Between Accounts

### Business Flow:

1. **Debit Sender’s Account**
2. **Perform Fraud Check**
3. **Credit Receiver’s Account**
4. **Log Transaction in Ledger**
5. **Send Notifications**

If any step fails (e.g., fraud detected), previous successful steps are rolled back via compensating transactions.

---

## 🧩 Project Structure

```bash
    saga-pattern/
    │
    ├── saga-choreography/
    │ ├── account-service/
    │ ├── fraud-service/
    │ ├── ledger-service/
    │ ├── notification-service/
    │ └── common-lib/
    │
    ├── saga-orchestration/
    │ ├── orchestrator-service/
    │ ├── account-service/
    │ ├── fraud-service/
    │ ├── ledger-service/
    │ ├── notification-service/
    │ └── common-lib/
    │
    └── kafka-config/ (Kafka producer/consumer config)
```

---

## 🎯 Saga Implementations

### 1. 🧵 Choreography (Event-Driven)

Each service:

- Performs its local transaction
- Publishes a domain event
- Next service listens and continues the flow

> ⚠️ No central coordination  
> ✅ Loose coupling  
> ❌ Harder to debug flow

### 2. 🎯 Orchestration (Command-Based)

An **Orchestrator Service**:

- Controls the saga
- Sends commands to services
- Waits for events to decide the next step

> ✅ Easier to trace and monitor  
> ✅ Centralized error handling  
> ❌ Tight coupling with orchestrator

---

## 🔄 Example Flow (Orchestration)

1. `orchestrator-service` → sends `DebitCommand`
2. `account-service` → debits amount, sends `DebitSuccessEvent`
3. `orchestrator-service` → sends `FraudCheckCommand`
4. `fraud-service` → passes check, sends `FraudPassedEvent`
5. `orchestrator-service` → sends `CreditCommand`
6. And so on...

If any step fails, it sends compensating commands like `CreditReversalCommand`.

---

## 🚀 Technologies Used

| Tool / Library  | Purpose                 |
|-----------------|-------------------------|
| Spring Boot     | Service framework       |
| Spring Kafka    | Messaging/event bus     |
| Lombok          | Boilerplate reduction   |
| Docker Compose  | Kafka & Zookeeper setup |
| Swagger/OpenAPI | API documentation       |

---

## ⚙️ Setup Instructions

### 1. Prerequisites

- Java 17+
- Docker & Docker Compose
- Kafka (via Docker)

### 2. Start Kafka

```bash
    docker-compose -f docker-compose-kafka.yml up
```

---

## 📄 Documentation

For detailed explanation and diagrams, refer to this Google Doc:  
🔗 [Saga Design Pattern - Banking Project Notes](https://docs.google.com/document/d/1ga0ufnN0_Q2yqzQB_WPuNcIQ9Cj-DXamKv2B-XVGey4/edit?tab=t.c0xc69wbfps5#heading=h.tvm5eeafa2e3)
---