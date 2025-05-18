# Ice Cream Shop

A simple Java project demonstrating the use of **Singleton**, **Factory**, and **Decorator** design patterns through a basic ice cream shop application.

---

## Project Overview

This project simulates a small ice cream shop where customers can order different flavors of ice cream (Vanilla, Chocolate, Strawberry) and add toppings such as chocolate glaze or chocolate sticks.

The goal is to illustrate how classic design patterns can be applied to create a flexible and maintainable system:

- **Singleton**: Ensures there is only one instance of the `Shop`.
- **Factory**: Provides a simple way to create different types of ice cream.
- **Decorator**: Allows dynamic addition of toppings to ice cream without modifying original classes.

---

## Design Patterns Applied

### Singleton (`Shop`)

- Guarantees a single shared instance of the shop.
- Accessed through `Shop.getShop()`.

### Factory (`IceCreamFactory`)

- Centralizes creation logic for various ice cream flavors.
- Use `IceCreamFactory.makeIceCream(String type)` to get specific ice cream instances.

### Decorator (`AddOn` and subclasses)

- Extends ice cream objects with additional toppings.
- Supports layering multiple add-ons like chocolate glaze and sticks.

---
### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven 3.6 or higher


---

## Getting Started: How to Run This Project

Follow these steps to download, build, and run the Ice Cream Shop Java application on your computer.

Open your terminal (Command Prompt, PowerShell, or Bash) and run:

```bash
git clone https://github.com/michaela03/Ice-Cream-Shop.git
