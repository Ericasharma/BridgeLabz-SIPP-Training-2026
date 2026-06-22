import java.util.Scanner;

public class FriendDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar age: ");
        int amarAge = sc.nextInt();

        System.out.print("Enter Amar height: ");
        double amarHeight = sc.nextDouble();

        System.out.print("Enter Akbar age: ");
        int akbarAge = sc.nextInt();

        System.out.print("Enter Akbar height: ");
        double akbarHeight = sc.nextDouble();

        System.out.print("Enter Anthony age: ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Anthony height: ");
        double anthonyHeight = sc.nextDouble();

        // Find youngest friend
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Youngest friend is Amar");
        } 
        else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Youngest friend is Akbar");
        } 
        else {
            System.out.println("Youngest friend is Anthony");
        }

        // Find tallest friend
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Tallest friend is Amar");
        } 
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Tallest friend is Akbar");
        } 
        else {
            System.out.println("Tallest friend is Anthony");
        }

        sc.close();
    }
}