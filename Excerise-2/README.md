# Mars Rover Simulation 🚀

## Overview

Welcome to the Mars Rover Simulation project! This Java-based application simulates a Mars Rover navigating a grid-based terrain. The Rover can move forward, turn left, and turn right, while avoiding obstacles and staying within the boundaries of the grid. The project emphasizes pure Object-Oriented Programming (OOP), design patterns, and robust software design principles.

## Features

- *Grid-Based Navigation*: The Rover navigates a grid defined by user inputs.
- *Rover Commands*: Supports commands to move forward, turn left, and turn right.
- *Obstacle Detection*: The Rover detects obstacles and records their positions.
- *Status Report*: The Rover provides status reports on its current position and direction.
- *Design Patterns*: Utilizes Command Pattern, Composite Pattern, and other OOP principles for a clean and maintainable codebase.

## Key Components

### Grid

Represents the terrain the Rover navigates. Handles grid boundaries and obstacles.

### Rover

The main entity that moves on the grid. Encapsulates its position, direction, and movement logic.

### Commands

Encapsulates movement commands (Move, TurnLeft, TurnRight) using the Command Pattern for flexibility and extensibility.

### Obstacles

Represents obstacles on the grid. The Rover records any encountered obstacles during navigation.

## Design Patterns

- *Command Pattern*: Encapsulates 'M', 'L', 'R' commands as objects.
- *Composite Pattern*: Represents the grid and obstacles.
- *Singleton Pattern*: Manages the state of the grid.
- *OOP Principles*: Applies encapsulation, polymorphism, and inheritance effectively.


Follow the prompts to input grid size, obstacles, starting position, direction, and commands.

### Example


-*Enter grid width:* 10 
-Enter grid height: 10 
-Enter number of obstacles: 2
-Enter obstacle 1 x-coordinate: 2
-Enter obstacle 1 y-coordinate: 2
-Enter obstacle 2 x-coordinate: 3
-Enter obstacle 2 y-coordinate: 5
-Enter starting x-coordinate: 0
-Enter starting y-coordinate: 0
-Enter starting direction (N/E/S/W): N
-Enter the number of commands: 6
-Enter commands (M for move, L for turn left, R for turn right):
M
M
R
M
L
M


-Output:

-Rover is at (1, 3) facing East.
Rover encountered obstacles at:
(2, 2)


## Code Structure

- *com.marsrover*: Main package
  - *commands*: Command implementations (MoveCommand, TurnLeftCommand, TurnRightCommand)
  - *grid*: Grid and Obstacle classes
  - *rover*: Rover, Direction, and StatusReport classes
  - *Main.java*: Entry point of the application

## Evaluation Criteria

- *Code Quality*: Adheres to best practices, SOLID principles, and design patterns.
- *Functionality*: Meets all requirements and handles real-time data effectively.
- *Global Convention*: Code is structured and written in a globally understandable manner.
- *Gold Standards*: Effective logging, exception handling, and validations.
- *Code Walkthrough*: Easily explainable architecture, design patterns used, and decisions taken.

## Contact

For any queries or further information, please reach out to [Karthikeyansevugamurthy.com](mailto:Karthikeyansevugamurthy.com) .
