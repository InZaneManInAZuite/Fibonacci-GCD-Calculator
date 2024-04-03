package src.main.java;
public class FibonacciGCD {

    private int sumOfFirstNFibonacciNumbers(int n) {

        // Initialize tracking of Fibonacci numbers
        int sum = 0;
        int a = 0;
        int b = 1;


        // Print first n Fibonacci numbers
        System.out.print("The first " + n + " fibonacci numbers are: ");


        // Loop to find first n Fibonacci numbers and add them to sum
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            sum += a;
            int temp = a;
            a = b;
            b = temp + b;
        }

        System.out.print("\n");


        // Return sum
        return sum;
    }

    private int getGCD(int a, int b) {

        // Make sure a is greater than b
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }


        // Base case
        if (b == 0) {
            return a;
        }


        // Recursive case
        return getGCD(b, a % b);
    }

    public int computeGCD(int firstFibonacciSeries, int secondFibonacciSeries) {

        // If a or b is 0, return 0
        if (firstFibonacciSeries <= 0 || secondFibonacciSeries <= 0) {
            System.out.println("Invalid input. Cardinality must be greater than 0.\n");
            return 0;
        }


        // Find sum of first a and b fibonacci numbers
        int sumA = sumOfFirstNFibonacciNumbers(firstFibonacciSeries);
        System.out.println("Sum of first " + firstFibonacciSeries + " fibonacci numbers: " + sumA);

        int sumB;
        if (firstFibonacciSeries != secondFibonacciSeries) {
            sumB = sumOfFirstNFibonacciNumbers(secondFibonacciSeries);
            System.out.println("Sum of first " + secondFibonacciSeries + " fibonacci numbers: " + sumB);
        } else {
            sumB = sumA;
        }
        


        // Return gcd of sum of first a fibonacci numbers and sum of first b fibonacci numbers
        int result = getGCD(sumA, sumB);
        System.out.println("\nGCD of sum of first " + firstFibonacciSeries + " and " + secondFibonacciSeries + " fibonacci numbers: " + result + "\n");
        return result;
    }
}
