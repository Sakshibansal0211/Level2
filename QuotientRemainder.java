import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // Checking division by zero
        if (number2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            // Calculating quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Printing result
            System.out.println("The Quotient is " + quotient 
                    + " and Reminder is " + remainder 
                    + " of two number " + number1 
                    + " and " + number2 + ".");
        }

        sc.close();
    }
}