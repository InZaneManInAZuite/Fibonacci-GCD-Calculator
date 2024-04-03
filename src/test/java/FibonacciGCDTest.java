// Import Junit test classes
package src.test.java;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// Import input output classes
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

// Import classes to be tested
import src.main.java.FibonacciGCD;
import src.main.java.DisplayFibonacci;


@RunWith(Suite.class)
@SuiteClasses({
    FibonacciGCDTest.ComputeGCDTests.class,
    FibonacciGCDTest.DisplayTests.class
})
public class FibonacciGCDTest {

    public static class ComputeGCDTests {

        @Test
        public void test_example() {
            // Arrange
            int a = 4;
            int b = 3;
            FibonacciGCD fib = new FibonacciGCD();

            // Act
            int result = fib.computeGCD(a, b);

            // Assert
            Assert.assertEquals(2, result);
        }

        @Test
        public void test_cardinal_A_is_zero() {
            // Arrange
            int a = 0, b = 3;
            FibonacciGCD fib = new FibonacciGCD();
            OutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // Act
            fib.computeGCD(a, b);

            // Assert
            Assert.assertEquals("Invalid input. Cardinality must be greater than 0.".trim(), outputStream.toString().trim());
            System.setOut(System.out);
        }

        @Test
        public void test_cardinal_B_is_zero() {
            // Arrange
            int a = 3, b = 0;
            FibonacciGCD fib = new FibonacciGCD();
            OutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // Act
            fib.computeGCD(a, b);

            // Assert
            Assert.assertEquals("Invalid input. Cardinality must be greater than 0.".trim(), outputStream.toString().trim());
            System.setOut(System.out);
        }

        @Test
        public void test_cardinal_A_and_B_is_zero() {
            // Arrange
            int a = 0, b = 0;
            FibonacciGCD fib = new FibonacciGCD();
            OutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // Act
            fib.computeGCD(a, b);

            // Assert
            Assert.assertEquals("Invalid input. Cardinality must be greater than 0.".trim(), outputStream.toString().trim());
            System.setOut(System.out);
        }

        @Test
        public void test_cardinal_A_is_negative() {
            // Arrange
            int a = -1, b = 3;
            FibonacciGCD fib = new FibonacciGCD();
            OutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // Act
            fib.computeGCD(a, b);

            // Assert
            Assert.assertEquals("Invalid input. Cardinality must be greater than 0.".trim(), outputStream.toString().trim());
            System.setOut(System.out);
        }

        @Test
        public void test_cardinal_B_is_negative() {
            // Arrange
            int a = 3, b = -1;
            FibonacciGCD fib = new FibonacciGCD();
            OutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // Act
            fib.computeGCD(a, b);

            // Assert
            Assert.assertEquals("Invalid input. Cardinality must be greater than 0.".trim(), outputStream.toString().trim());
            System.setOut(System.out);
        }

        @Test
        public void test_cardinal_A_and_B_is_negative() {
            // Arrange
            int a = -1, b = -1;
            FibonacciGCD fib = new FibonacciGCD();
            OutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // Act
            fib.computeGCD(a, b);

            // Assert
            Assert.assertEquals("Invalid input. Cardinality must be greater than 0.".trim(), outputStream.toString().trim());
            System.setOut(System.out);
        }

        @Test
        public void test_example_2() {
            // Arrange
            int a = 5;
            int b = 3;
            FibonacciGCD fib = new FibonacciGCD();

            // Act
            int result = fib.computeGCD(a, b);

            // Assert
            Assert.assertEquals(1, result);
        }

        @Test
        public void test_example_3() {
            // Arrange
            int a = 9;
            int b = 6;
            FibonacciGCD fib = new FibonacciGCD();

            // Act
            int result = fib.computeGCD(a, b);

            // Assert
            Assert.assertEquals(6, result);
        }

        @Test
        public void test_B_is_greater_than_A() {
            // Arrange
            int a = 3;
            int b = 5;
            FibonacciGCD fib = new FibonacciGCD();

            // Act
            int result = fib.computeGCD(b, a);

            // Assert
            Assert.assertEquals(1, result);
        }

        @Test
        public void test_A_is_more_than_48() {
            // Arrange
            int a = 49;
            int b = 3;
            FibonacciGCD fib = new FibonacciGCD();
            OutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // Act
            fib.computeGCD(a, b);

            // Assert
            Assert.assertEquals("Unable to compute. Please enter a number less than 48.".trim(), outputStream.toString().trim());
            System.setOut(System.out);
        }

    }


    public static class DisplayTests {
            
            @Test
            public void test_menu_exit() {
                // Arrange
                String command = "EXIT\n";
                InputStream inputStream = new ByteArrayInputStream(command.getBytes());
                System.setIn(inputStream);
                DisplayFibonacci display = new DisplayFibonacci();
                
                
                // Act
                boolean running = display.menu();

                // Assert
                Assert.assertFalse(running);
                System.setIn(System.in);
            }

            @Test
            public void test_menu_invalid_command() {
                // Arrange
                String command = "INVALID\n";
                InputStream inputStream = new ByteArrayInputStream(command.getBytes());
                System.setIn(inputStream);
                DisplayFibonacci display = new DisplayFibonacci();
                OutputStream outputStream = new ByteArrayOutputStream();
                System.setOut(new PrintStream(outputStream));
                
                // Act
                boolean running = display.menu();
                boolean contains = outputStream.toString().trim().contains("Invalid command. Please try again.");
                

                // Assert
                Assert.assertTrue(contains);
                Assert.assertTrue(running);
                System.setIn(System.in);
                System.setOut(System.out);
            }

            @Test
            public void test_run_calculate_mulitple_times() {
                // Arrange
                String command = "CALCULATE\n5\n3\n\nCalculate\n9\n7\n\nEXIT\n";
                InputStream inputStream = new ByteArrayInputStream(command.getBytes());
                System.setIn(inputStream);
                DisplayFibonacci display = new DisplayFibonacci();
                OutputStream outputStream = new ByteArrayOutputStream();
                System.setOut(new PrintStream(outputStream));
                
                // Act
                display.run();
                boolean containsCalc1 = outputStream.toString().trim().contains("GCD of sum of first 5 and 3 fibonacci numbers: 1");
                boolean containsCalc2 = outputStream.toString().trim().contains("GCD of sum of first 9 and 7 fibonacci numbers: 2");
                boolean containsExit = outputStream.toString().trim().contains("Thank you for using the Fibonacci GCD Calculator! Have a great day!");
                

                // Assert
                Assert.assertTrue(containsCalc1);
                Assert.assertTrue(containsCalc2);
                Assert.assertTrue(containsExit);
                System.setIn(System.in);
                System.setOut(System.out);
            }
     
    }
}
