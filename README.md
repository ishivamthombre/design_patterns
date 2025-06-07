# 🎨 Gang of Four (GoF) Design Patterns in Java

## 📘 Overview

The **Gang of Four (GoF)** design patterns are 23 classic software design patterns categorized into **Creational**, **Structural**, and *
*Behavioral** types. These patterns provide standard solutions to common software design problems and promote reusability, maintainability,
and scalability.

---

## 🔧 Creational Patterns (5)

These patterns provide various object creation mechanisms, increasing flexibility and reuse of existing code.

| Pattern              | Description                                                                              | Example Use Case                         |
|----------------------|------------------------------------------------------------------------------------------|------------------------------------------|
| **Singleton**        | Ensures only one instance of a class exists and provides a global point of access to it. | Logger, Configuration Manager            |
| **Factory Method**   | Creates objects without specifying the exact class of object to create.                  | ShapeFactory, Notification Factory       |
| **Abstract Factory** | Produces families of related objects without specifying concrete classes.                | UI Toolkit for different OS themes       |
| **Builder**          | Constructs complex objects step-by-step.                                                 | Creating Immutable Objects, HTML Builder |
| **Prototype**        | Clones existing objects without making code dependent on their classes.                  | Object Caching, Game Object Duplication  |

---

## 🧱 Structural Patterns (7)

These patterns deal with object composition, ensuring that different parts of a system fit together efficiently.

| Pattern       | Description                                                                | Example Use Case                             |
|---------------|----------------------------------------------------------------------------|----------------------------------------------|
| **Adapter**   | Allows incompatible interfaces to work together.                           | Legacy system integration                    |
| **Bridge**    | Decouples abstraction from its implementation.                             | Device drivers, UI elements                  |
| **Composite** | Composes objects into tree structures to represent part-whole hierarchies. | File System, GUI Layouts                     |
| **Decorator** | Adds responsibilities to objects dynamically.                              | Java I/O Streams                             |
| **Facade**    | Provides a simplified interface to a complex subsystem.                    | API Gateways, SDK Wrappers                   |
| **Flyweight** | Reduces memory usage by sharing data between similar objects.              | Font rendering, Game objects                 |
| **Proxy**     | Provides a surrogate for another object to control access.                 | Virtual Proxy, Security Proxy, Logging Proxy |

---

## 🔁 Behavioral Patterns (11)

These patterns are concerned with how objects interact and how responsibilities are distributed.

| Pattern                     | Description                                                        | Example Use Case                        |
|-----------------------------|--------------------------------------------------------------------|-----------------------------------------|
| **Chain of Responsibility** | Passes a request along a chain of handlers.                        | Logging Levels, Middleware Pipelines    |
| **Command**                 | Encapsulates a request as an object, allowing parameterization.    | Undo/Redo, Job Scheduling               |
| **Interpreter**             | Interprets sentences in a language.                                | Expression Parsing, SQL/Regex Engines   |
| **Iterator**                | Provides sequential access to elements without exposing structure. | Collection Traversal                    |
| **Mediator**                | Coordinates interaction between objects.                           | Chat Systems, UI Dialog Management      |
| **Memento**                 | Captures and restores object state without breaking encapsulation. | Undo Mechanism in Editors               |
| **Observer**                | Notifies multiple objects about state changes.                     | Event Listeners, MVC Model-View Binding |
| **State**                   | Alters behavior when object’s internal state changes.              | Media Player States, UI State Machines  |
| **Strategy**                | Encapsulates interchangeable behaviors or algorithms.              | Sorting Strategy, Payment Method        |
| **Template Method**         | Defines skeleton of an algorithm, deferring steps to subclasses.   | Framework methods, Testing Frameworks   |
| **Visitor**                 | Adds operations to objects without modifying them.                 | Compilers, Document Processing Engines  |

---

## 🏗 Structure & Code Examples

Each pattern in this repository contains:

- 📄 **Explanation**
- 📁 **Java Implementation**
- ✅ **Use Case**
- 📌 **UML Diagram**

---

## 📚 References

- *Design Patterns: Elements of Reusable Object-Oriented Software* (GoF Book)
- [Refactoring Guru](https://refactoring.guru/design-patterns)
- Effective Java – Joshua Bloch

---