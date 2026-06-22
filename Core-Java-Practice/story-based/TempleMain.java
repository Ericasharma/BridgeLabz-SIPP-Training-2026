import java.util.Scanner;

class TemplePuzzle {

    // Count moves for Tower of Hanoi
    int moveCount = 0;

    // Tower of Hanoi
    public void towerOfHanoi(int n, char source, char helper, char destination) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, helper);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveCount++;

        towerOfHanoi(n - 1, helper, source, destination);
    }

    // Recursive Binary Search
    public int binarySearch(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, left, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, right, target);
    }

    // Sum of Digits
    public int sumOfDigits(int n) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigits(n / 10);
    }

    // Reverse String
    public String reverseString(String str) {

        if (str.isEmpty()) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // Check Balanced Parentheses without Stack
    public boolean isBalanced(String str, int count, int index) {

        if (count < 0) {
            return false;
        }

        if (index == str.length()) {
            return count == 0;
        }

        if (str.charAt(index) == '(') {
            return isBalanced(str, count + 1, index + 1);
        }

        if (str.charAt(index) == ')') {
            return isBalanced(str, count - 1, index + 1);
        }

        return isBalanced(str, count, index + 1);
    }
}

public class TempleMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TemplePuzzle obj = new TemplePuzzle();

        // Tower of Hanoi
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        System.out.println("Tower of Hanoi Moves:");
        obj.towerOfHanoi(n, 'A', 'B', 'C');

        System.out.println("Total Moves: " + obj.moveCount);

        // Binary Search
        int[] prices = {100, 200, 300, 400, 500};

        System.out.print("Enter price to search: ");
        int target = sc.nextInt();

        int index = obj.binarySearch(prices, 0, prices.length - 1, target);

        if (index != -1) {
            System.out.println("Price found at index: " + index);
        } else {
            System.out.println("Price not found");
        }

        // Sum of Digits
        System.out.print("Enter number for digit sum: ");
        int num = sc.nextInt();

        System.out.println("Sum of Digits: " + obj.sumOfDigits(num));

        sc.nextLine();

        // Reverse String
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Reversed String: " + obj.reverseString(text));

        // Balanced Parentheses
        System.out.print("Enter parentheses string: ");
        String bracket = sc.nextLine();

        if (obj.isBalanced(bracket, 0, 0)) {
            System.out.println("Balanced Parentheses");
        } else {
            System.out.println("Not Balanced");
        }

        sc.close();
    }
}