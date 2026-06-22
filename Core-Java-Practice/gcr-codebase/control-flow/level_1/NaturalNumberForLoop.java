import java.util.Scanner;

public class NaturalNumberForLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if number is natural
        if (n > 0) {

            int sumFor = 0;

            // Sum using for loop
            for (int i = 1; i <= n; i++) {
                sumFor = sumFor + i;
            }

            // Sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);

            // Compare results
            if (sumFor == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Results are not equal.");
            }

        } else {
            System.out.println("Please enter a natural number.");
        }

        sc.close();
    }
}