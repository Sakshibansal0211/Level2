import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter unit price: ");
        float unitPrice = sc.nextFloat();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Calculating total price
        float totalPrice = unitPrice * quantity;

        // Printing result
        System.out.println("The total purchase price is INR " 
                + totalPrice + " if the quantity " 
                + quantity + " and unit price is INR " 
                + unitPrice + ".");

        sc.close();
    }
}