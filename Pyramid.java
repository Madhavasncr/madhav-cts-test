// write a program that displays an inverted pyramid of stars. The program should prompt the user to enter the number of lines for the pyramid and then display the pyramid usung following
// rules:
//the number of stars in each row of the pyramid increases by 1.
//the number of rows in the pyramid is equal to the number of rows entered by the user.
//the stars in each row printed on a seapaerate line.
//the program should display the pyramid in the following format:
//Enter the number of lines for the pyramid: 6
//* * * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number of lines for the pyramid: ");
            int lines = input.nextInt();
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < lines - i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } // Close the Scanner object
    }
}
