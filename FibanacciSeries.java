// write a sequence of numbers baesd on the Fibonacci principle.the first two numbers are 0 and 1. Each subsequent number is the sum of the previous two.
// the sequence continues untill the sum of the last two numbers is less than 100.

public class FibanacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        n3 = n1 + n2;
        while (n3 < 100) {
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }
}