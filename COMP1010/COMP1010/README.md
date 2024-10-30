# Masters of MQ: Turn-Based RPG Combat


## Project Description

Masters of MQ is a turn based RPG combat simulation game written in Java created to deliver strategic gameplay inspired by classic RPG mechanics. In this text based battle system two teams will face off until one team has all its characters reach zero health points and at each turn characters can choose from actions such as attacking or defending with outcomes influenced by various stats, equipment, and random elements. The game features battle logs allowing players to follow the action making each turn both engaging and strategic.


## Problem Solved

This project creates an accessible and immersive RPG experience through simple turn based combat mechanics. It demonstrates how game elements like health points, turn taking, and stat based outcomes can be implemented in Java to create an engaging console based game. By focusing on character interactions and random variations in outcomes the game creates a challenge for players while demonstrating core concepts of object-oriented programming.


## Program Structure

The project is organized into four main classes, each with a distinct role in the games structure and flow:

1. **`App.java`**  
   The main entry point of the application responsible for initialising teams setting up characters and running the battle loop. This class handles user input oversees game flow and determines the win conditions.

2. **`BattleLog.java`**  
   Manages the games battle log recording each action taken by characters and generating easy to read text file every attack defense and result is logged here which allows players to keep track of there battles progress and character stats.

3. **`Character.java`**  
   Defines each characters core attributes including health points strength intelligence and defense. It includes methods for characters to take actions like attacking or defending with outcomes influenced by both base stats and randomised elements

4. **`Team.java`**  
   Represents a team of characters managing team based logic like turn order and victory conditions it tracks each characters status ensures characters without health points cant act and checks for when a team is defeated.  **NOTE** This Java file leaves development to add multiple characters per team.


## How to Run the Program

To set up and run Masters of MQ follow these simple steps:

1. **Download** all the provided `.java` files into the same directory.
2. **Open a terminal** in the directory where the files are located.
3. **Compile** the Java files:
    ```bash
    javac App.java BattleLog.java Character.java Team.java
    ```
4. **Run** the program:
    ```bash
    java App
    ```

5. **Gameplay Instructions**:
   - Follow the on screen prompts to progress through each turn.
   - When its your teams turn choose from available actions for each character such as “Attack” or “Defend”.
   - After each action check the Battle Log output to see the results of your decisions and the impact on enemy characters.
   - Continue taking turns until one team is completely defeated.


### Example Gameplay

Upon starting the game, players receive a setup of the two teams and character details. For each turn, characters can take actions based on their attributes

Sample console output:
```plaintext
Choose character creation option:
1. Use predefined characters
2. Create custom characters
Enter choice: 2
Enter stats for the Hero character:
Enter name: Aang
You have 30 points to allocate.
Enter health points: 15
Points remaining: 15
Enter strength points: 10
Points remaining: 5
Enter defense points: 3
Points remaining: 2
Enter intelligence points: 2
Aang has been created with Health: 15, Strength: 10, Defense: 3, Intelligence: 2.

--- Heros Turn ---
Choose action: 1. Attack 2. Defend
> 1
Aang attacked Deadpool! Deadpool took 5 points of damage!

[Health Status]
Aang - Health: 15
Deadpool - Health: 20
```

Each actions result depends on the characters strength intelligence and other attributes along with a random dice roll that can affect damage and hit accuracy making each battle unique.
### The UML file of the Program
![UML Image](./UML/UML.png)

