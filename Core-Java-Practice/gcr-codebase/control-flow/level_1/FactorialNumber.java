import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Check if number is positive
        if (num >= 0) {

            int factorial = 1;
            int i = 1;

            // Calculate factorial using while loop
            while (i <= num) {
                factorial = factorial * i;
                i++;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);

        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}