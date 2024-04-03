# Project Name

SOFTENG 282 - Assignment 2
The Fibonacci GCD Calculator

# Description

With two positive integers A and B given by the user, this program calculates the greatest 
common divisor (GCD) of the sum of the first A Fibonacci numbers and the sum of the first B 
Fibonacci numbers. 

# Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Working](#working)
- [Contributing](#contributing)

# Installation

Clone this repository to your device using git. Select a new folder you want to place the
repository into to use "git clone". 
Link to the repository: https://github.com/InZaneManInAZuite/SOFTENG282Assign2.git

or - simply download the FibonacciGCD.jar file into your device. Then follow instructions
on how to use the program

# Working

The code and an outline on how the program works in general (Especially regarding the 
front end commands menu and other displays) can be seen on the SOFTENG282Assign2Doc.pdf, 
which is a documentation of the classes made for the program, including the tests.

The solution to the task:

The back end processes are mediated by the FibonacciGCD class in code made. To simplify the
coding process, the method that actually looks for the GCD (Greatest Common Divisor) of the 
sum of the first A and first B Fibonacci numbers called computeGCD() calls on two different 
methods. This essentially splits the task into two parts. A method which looks for the sum
of all the first elements of a Fibonacci sequence of a certain length, and a method which 
looks for the GCD of two numbers.

## Sum of First N Fibonacci Numbers

The method that looks for the sum of Fibonacci numbers is the sumOfFirstNFibonacciNumbers().
This method takes in an integer input n, and outputs an integer. This utilizes three main 
integer variables called a, b, and sum; and a for loop.

This algorithm works as follows:

Initialize the variables with a and sum starting at 0 and b starting at 1. This sets a and b
equal to the first two elements of a Fibonacci sequence.

Inside a for loop that tracks how many numbers have been added to the sum, ei the variable n,
first add the element within a to sum. 

Then a temporary variable temp is set to equal to a.

Then a is changed to be b;

Then b is changed to be the sum of the new a and temp. This essentially changes a and b to be
the next pair of numbers in the Fibonacci sequence. And thus when the for loop has looped n times
the first N fibonacci numbers have been added to sum.

NOTE: If the input is non-positive, the resulting sum will be 0. This will be representative of
summing no Fibonacci number as there is no "0th" or below Fibonacci number. Thus the program will
reject user inputs that are non-positive.

Lastly return the sum variable.

![alt text](/images/work1.png)

## GCD of Two Numbers

The method that looks for the GCD of two numbers is the getGCD(). This method takes in two integer 
input a and b, and outputs an integer. This directly follows the Euclidean Algorithm as a recurssive
method.

Euclidean Algorithm works out the GCD by repeatedly expressing the two input numbers A and B where A 
is larger as A = Bn + C for some integer n, with C being a remainder. Then repeating this for B and C. 
Once C becomes equal to 0, B is shown to be the GCD of A and B. This repetitiveness can be turned 
into a recursive method.

First to make it similar to how Euclidean Algorithm is done by hand, we set that a is greater
than b. To do so if a is less than b, we set a temporary variable temp equal to a. Then set a equal 
to b. And finally, set b equal to temp. Remember all numbers in the Fibonacci Sequence are non-negative.

Then as a base case, if b is equal to 0, we return a.

Then for the recursive case, we return what is outputted when we input to itself b and a mod b. Remember
a mod b essentially is equal to the remainder just like how C is in A = Bn + C.

![alt text](/images/work2.png)

## The Full Algorithm

To reiterate, the full algorithm looks for the GCD of the sum of the first A and first B Fibonacci 
numbers called in the program as the method computeGCD(). This method takes in two integer input called 
firstFibonacciSeries and secondFibonacciSeries, and outputs an integer. Let us call these two inputs
A and B for now.

First, it obtains the sum of the first A fibonacci numbers by calling sumOfFirstNFibonacciNumbers().
Let's call this sumA.

Then repeats this process for B and call it sumB.

Lastly we find the GCD between sumA and sumB by calling getGCD().

![alt text](/images/work3.png)

NOTE: The actual code may differ slightly from the explaination on how it works. These differences are
simply made to print out into the command line certain information.

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
