import java.util.Scanner;

public class SumUsingBreak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double number;

        while (true) {

            System.out.print("Enter a number: ");
            number = sc.nextDouble();

            // Break if number is 0 or negative
            if (number <= 0) {
                break;
            }

            total = total + number;
        }

        System.out.println("Total sum is: " + total);

        sc.close();
    }
}