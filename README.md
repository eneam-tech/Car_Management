# Car Management

A simple Java project for managing different types of cars using a **factory design pattern**.  
The project demonstrates how to build and instantiate various car types (e.g., **Electric**, **SUV**, **Luxury**) based on a given configuration.

## Features

- Create different car types using the `CarFactory`.
- Use of **Builder Pattern** for flexible object construction.
- Error handling for unknown car types.
- Decoupled car behavior via the use of an `Accelerator` abstraction.

## How It Works

The `CarFactory` provides a `createCar` method that:
- Accepts a `CarType` (e.g., `ELECTRIC`, `SUV`, `LUXURY`).
- Accepts an `Accelerator` instance.
- Builds the corresponding `Car` object using its Builder.

## Requirements

- Java 8 or higher
- Maven (for project building)

