package src.main.java;
import java.util.Scanner;

public class DisplayFibonacci {
    // DisplayFibonacci class is responsible for the user interface of the program
    private boolean running = true;
    private Scanner scanner = new Scanner(System.in);

    // Constructor
    public DisplayFibonacci() {}

    // Main method to run the program
    public void run() {
        printHeader();
        while (running) {
            running = menu();
        }
        printFooter();
        scanner.close();
    }

    // Print the header of the program
    public void printHeader(){
        
        // Ascii art saying SOFTENG 282 and the program description
        System.out.println("\n");
        System.out.println("  .oooooooo.   .oooooooo.  oooooooooooo oooooooooooo oooooooooooo ooooo  ooooo  .oooooooo.  ");
        System.out.println("  888'  `888' .888'  `888. `888'     `8 8' `8888' `8 `888'     `8 `8888. `888' .888'  `888' ");
        System.out.println("  `888.  `''  888'    `888  888    .        8888      888.   .     88888. 888  888'  . `''  ");
        System.out.println("   `888888.   888      888  888oooo8        8888      888oooo8     888 88 888  888   oooo.  ");
        System.out.println("  ...  `888.  888.    .888  888    '        8888      888'   '     888 `88888  888.  ' 888' ");
        System.out.println(" '888.  .888  `888.  .888'  888            .8888.    .888.     .8  888  `8888  `888.  .888' ");
        System.out.println("  `99999999'   `99999999'   888           .o8888o.   o888oooooooo .999.  .999.  `99999999'  \n");
        System.out.println("                           .ooooooooo.   .oooooooo.  .ooooooooo.                            ");
        System.out.println("                           888'   `888' '888'  `888' 888'   `888'                           ");
        System.out.println("                           `''   .888'  `888.  .888' `''   .888'                            ");
        System.out.println("                               .888'      `888888.       .888'                              ");
        System.out.println("                             .888'   .  .888'  `888.   .888'   .                            ");
        System.out.println("                           .888'    .8' '888.  .888' .888'    .8'                           ");
        System.out.println("                           oooooooooo9'  `99999999'  oooooooooo9'                           ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("Welcome to the Fibonacci GCD Calculator! Insert below which Ath and Bth Fibonacci number do ");
        System.out.println("                             you want to calculate the GCD of.                              \n");
  
    }

    // Display the menu commands of the program
    public boolean menu(){
        System.out.println("Please select your next command:\n");
        System.out.println("CALCULATE - Calculate the GCD of the sum of the first A and B Fibonacci numbers");
        System.out.println("EXIT      - Exit the program\n");
        System.out.print(">> ");
        String command = scanner.nextLine();
        System.out.println("");
        
        if (command.trim().equalsIgnoreCase("CALCULATE")){
            calculate();
            System.out.print("Press Enter to continue...");
            scanner.nextLine();
            System.out.println("\n--------------------------------------------------------------------------------------------");
        } else if (command.trim().equalsIgnoreCase("EXIT")){
            return false;
        } else {
            System.out.println("Invalid command. Please try again.\n");
            
        }
        return true;
    }

    // Access the FibonacciGCD class
    public void calculate(){
         // Get user input for A
        int a = getNumberInput("A");
        int b = getNumberInput("B");
        
        // Initialize FibonacciGCD object
        System.out.println("");
        FibonacciGCD fibonacciGCD = new FibonacciGCD();
        fibonacciGCD.computeGCD(a, b);
    }

    // Get user input for the nth number
    public int getNumberInput(String nth){
        int n = 0;
        boolean haveN = false;

        while (!haveN) {
            System.out.print("Insert "+ nth +": ");
            String input = scanner.nextLine();

            try {
                n = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if (n <= 0) {
                System.out.println("Invalid input. Cardinality "+ nth +" must be greater than 0.");
                continue;
            }

            if (n >= 48) {
                System.out.println("Unable to compute. Please enter a number less than 48.");
                continue;
            }
            haveN = true;
        }

        return n;
    }

    // Print the footer of the program
    public void printFooter(){
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("            Thank you for using the Fibonacci GCD Calculator! Have a great day!             \n");
        System.out.println("                        Author: Toshiro Mendoza        ID: 834872958                        ");
        System.out.println("                                 SOFTENG 282 - Assignment 2                                 \n");
    }
}
