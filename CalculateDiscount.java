//create program that calculate various discout perentages on a give cart amount.
//the program should prompt the user to enter the cart amount and then display the following discount percentages based on below rules:
//cart amount < $100, discount percentage is 5%
//cart amount >= $100 and < $200, discount percentage is 10%
//cart amount >= $200 discount percentage is 15%
//the program should then display the total cost of the cart , including the discount.

import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the cart amount: ");
            double cartAmount = input.nextDouble();
            double discount = 0;
            if (cartAmount < 100) {
                discount = cartAmount * 0.05;
            } else if (cartAmount >= 100 && cartAmount < 200) {
                discount = cartAmount * 0.10;
            } else if (cartAmount >= 200) {
                discount = cartAmount * 0.15;
            }
            double totalCost = cartAmount - discount;
            System.out.println("The total cost of the cart is: " + totalCost);
        } // Close the Scanner object
       
    }
}