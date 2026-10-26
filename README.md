
# Assignment 5 - Strategy Pattern

## Description
This project demonstrates the Strategy design pattern in Java.

The program has three route strategies:
- CarStrategy
- WalkStrategy
- CycleStrategy

The Navigator can change its strategy at runtime.

## Requirements
- Java 17

## How to Run
1. Open the project in IntelliJ IDEA.
2. Open Main.java.
3. Run the main method.

## How to Add a New Strategy
1. Create a class that implements RouteStrategy.
2. Implement the buildRoute() method.
3. Pass the new strategy to Navigator using setStrategy().
