import java.util.Scanner;

public class FizzBuzzForLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number > 0) {

            for (int i = 1; i <= number; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " FizzBuzz");
                } 
                else if (i % 3 == 0) {
                    System.out.println(i + " Fizz");
                } 
                else if (i % 5 == 0) {
                    System.out.println(i + " Buzz");
                } 
                else {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}