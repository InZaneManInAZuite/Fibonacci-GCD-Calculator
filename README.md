# Project Name

Fibonacci GCD Calculator

# Description

With two positive integers A and B given by the user, this program calculates the greatest 
common divisor (GCD) of the sum of the first A Fibonacci numbers and the sum of the first B 
Fibonacci numbers. 

# Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)

# Installation

[Provide instructions on how to install and set up your project]

# Usage

## Opening the Program

Open the command line and set the current directory to the location of the FibonacciGCD.jar
file. Then use the "java -jar FibonacciGCD.jar" in the command line to open the file.

In cases where the user is unable to use a .jar file, use instead from the same directory: 
"java src/main/java/Main.java"

When the program starts running, a menu screen similar to one below can be seen:

![alt text](/images/image1.png)

At the end of this screen we see arrows ">>" where the user can input "CALCULATE" or "EXIT". 
NOTE: These commands ignore cases, thus the user can simply write commands in lower case.
NOTE: Please mind the spelling of the commands.

## Calculate Command

If the CALCULATE command is selected, the program asks for an input for A and B. This is to
calculate the GCD of the sum of the first A and B Fibonacci numbers.

![alt text](/images/image2.png)

If the input is invalid, such as if the input is not a number, or is not greater than zero,
the program will ask the user repeatedly until a valid input A is given.

![alt text](/images/image3.png)

When two valid inputs A and B have been given by the user, the first A fibonacci numbers and 
the first B fibonacci numbers are shown along with the sum of those collection of numbers.
Then, the program then showns what the GCD (Greatest Common Divisor) of these two sums are.

![alt text](/images/image4.png)

NOTE: If A and B inputted are equal to each other, the sequence of numbers and the sum will
only appear once.

![alt text](/images/image5.png)

The program then asks the user to press enter to continue using the program. Pressing enter
will bring back the commands menu. From here, the user can use the program once again to
calculate the GCD of the sum of the first A and B Fibonacci numbers or exit the program.

![alt text](/images/image6.png)

## Exit Command

If the user chose the EXIT command, the program displays some texts and the program ends.

![alt text](/images/image7.png)

## Invalid Command

If the user inputs an invalid command, it repeats the command menu and asks the user for a
command until a valid command is given.

![alt text](/images/image8.png)


# Contributing

This is made by Toshiro Mendoza for Assignment 2 in SOFTENG 282.
