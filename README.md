# Project Name

Fibonacci GCD Calculator

## Description

With two positive integers A and B given by the user, this program calculates the greatest 
common divisor (GCD) of the sum of the first A Fibonacci numbers and the sum of the first B 
Fibonacci numbers. 

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)

## Installation

[Provide instructions on how to install and set up your project]

## Usage

# Opening the Program

Open the command line and set the current directory to the location of the FibonacciGCD.jar
file. Then use the "java -jar FibonacciGCD.jar" in the command line to open the file.

In cases where the user is unable to use a .jar file, use instead from the same directory: 
"java src/main/java/Main.java"

When the program starts running, a menu screen can be see such as this:
|--------------------------------------------------------------------------------------------|
|                                                                                            |
|                                                                                            |
|  .oooooooo.   .oooooooo.  oooooooooooo oooooooooooo oooooooooooo ooooo  ooooo  .oooooooo.  |
|  888'  \`888' .888'  \`888. \`888'     \`8 8' \`8888' \`8 \`888'     \`8 \`8888. \`888' .888'  `888' |
|  \`888.  \`''  888'    \`888  888    .        8888      888.   .     88888. 888  888'  . `''  |
|   `888888.   888      888  888oooo8        8888      888oooo8     888 88 888  888   oooo.  |
|  ...  \`888.  888.    .888  888    '        8888      888'   '     888 `88888  888.  ' 888' |
| '888.  .888  \`888.  .888'  888            .8888.    .888.     .8  888  \`8888  `888.  .888' |
|  \`99999999'   \`99999999'   888           .o8888o.   o888oooooooo .999.  .999.  `99999999'  |
|                                                                                            |
|                           .ooooooooo.   .oooooooo.  .ooooooooo.                            |
|                           888'   \`888' '888'  \`888' 888'   `888'                           |
|                           \`''   .888'  \`888.  .888' `''   .888'                            |
|                               .888'      `888888.       .888'                              |
|                             .888'   .  .888'  `888.   .888'   .                            |
|                           .888'    .8' '888.  .888' .888'    .8'                           |
|                           oooooooooo9'  `99999999'  oooooooooo9'                           |
|--------------------------------------------------------------------------------------------|
|                                                                                            |
|                                                                                            |
|Welcome to the Fibonacci GCD Calculator! Insert below which Ath and Bth Fibonacci number do |
|                             you want to calculate the GCD of.                              |
|                                                                                            |
|Please select your next command:                                                            |
|                                                                                            |
|CALCULATE - Calculate the GCD of the sum of the first A and B Fibonacci numbers             |
|EXIT      - Exit the program                                                                |
|                                                                                            |
|>>                                                                                          |
|--------------------------------------------------------------------------------------------|


At the end of this screen we see arrows ">>" where the user can input "CALCULATE" or "EXIT". 
NOTE: These commands ignore cases, thus the user can simply write commands in lower case.
NOTE: Please mind the spelling of the commands.

# Calculate Command

If the CALCULATE command is selected, the program asks for an input for A and B. This is to
calculate the GCD of the sum of the first A and B Fibonacci numbers.

|--------------------------------------------------------------------------------------------|
|>> CALCULATE                                                                                |
|                                                                                            |
|Insert A:                                                                                   |
|--------------------------------------------------------------------------------------------|

If the input is invalid, such as if the input is not a number, or is not greater than zero,
the program will ask the user repeatedly until a valid input A is given.

|--------------------------------------------------------------------------------------------|
|Insert A: Invalid_Input                                                                     |
|Invalid input. Please enter a number.                                                       |
|Insert A: 0                                                                                 |
|Invalid input. Cardinality A must be greater than 0.                                        |
|Insert A: 6                                                                                 |
|Insert B:                                                                                   |
|--------------------------------------------------------------------------------------------|

When two valid inputs A and B have been given by the user, the first A fibonacci numbers and 
the first B fibonacci numbers are shown along with the sum of those collection of numbers.
Then, the program then showns what the GCD (Greatest Common Divisor) of these two sums are.

|--------------------------------------------------------------------------------------------|
|Insert A: 6                                                                                 |
|Insert B: 9                                                                                 |
|                                                                                            |
|The first 6 fibonacci numbers are: 0 1 1 2 3 5                                              |
|Sum of first 6 fibonacci numbers: 12                                                        |
|The first 9 fibonacci numbers are: 0 1 1 2 3 5 8 13 21                                      |
|Sum of first 9 fibonacci numbers: 54                                                        |
|                                                                                            |
|GCD of sum of first 6 and 9 fibonacci numbers: 6                                            |
|                                                                                            |
|Press Enter to continue...                                                                  |
|--------------------------------------------------------------------------------------------|

NOTE: If A and B inputted are equal to each other, the sequence of numbers and the sum will
only appear once.

|--------------------------------------------------------------------------------------------|
|Insert A: 6                                                                                 |
|Insert B: 9                                                                                 |
|                                                                                            |
|The first 6 fibonacci numbers are: 0 1 1 2 3 5                                              |
|Sum of first 6 fibonacci numbers: 12                                                        |
|                                                                                            |
|GCD of sum of first 6 and 6 fibonacci numbers: 12                                           |
|                                                                                            |
|Press Enter to continue...                                                                  |
|--------------------------------------------------------------------------------------------|

The program then asks the user to press enter to continue using the program. Pressing enter
will bring back the commands menu. From here, the user can use the program once again to
calculate the GCD of the sum of the first A and B Fibonacci numbers or exit the program.

|--------------------------------------------------------------------------------------------|
|--------------------------------------------------------------------------------------------|
|Please select your next command:                                                            |
|                                                                                            |
|CALCULATE - Calculate the GCD of the sum of the first A and B Fibonacci numbers             |
|EXIT      - Exit the program                                                                |
|                                                                                            |
|>>                                                                                          |
|--------------------------------------------------------------------------------------------|

# Exit Command

If the user chose the EXIT command, the program displays some texts and the program ends.

|--------------------------------------------------------------------------------------------|
|>> EXIT                                                                                     |
|                                                                                            |
|--------------------------------------------------------------------------------------------|
|            Thank you for using the Fibonacci GCD Calculator! Have a great day!             |
|                                                                                            |
|                        Author: Toshiro Mendoza        ID: 834872958                        |
|                                 SOFTENG 282 - Assignment 2                                 |
|                                                                                            |
|--------------------------------------------------------------------------------------------|

# Invalid Command

If the user inputs an invalid command, it repeats the command menu and asks the user for a
command until a valid command is given.

|--------------------------------------------------------------------------------------------|
|>> INVALID                                                                                  |
|                                                                                            |
|Invalid command. Please try again.                                                          |
|                                                                                            |
|Please select your next command:                                                            |
|                                                                                            |
|CALCULATE - Calculate the GCD of the sum of the first A and B Fibonacci numbers             |
|EXIT      - Exit the program                                                                |
|                                                                                            |
|>>                                                                                          |
|--------------------------------------------------------------------------------------------|


## Contributing

This is made by Toshiro Mendoza for Assignment 2 in SOFTENG 282.
