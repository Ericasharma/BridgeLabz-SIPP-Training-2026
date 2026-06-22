import java.util.Scanner;

public class spy_agency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reverse a secret message
        System.out.print("Enter secret message: ");
        String message = sc.nextLine();

        String reverse = "";

        for (int i = message.length() - 1; i >= 0; i--) {
            reverse = reverse + message.charAt(i);
        }

        System.out.println("Reversed Message: " + reverse);

        // Palindrome check
        if (message.equalsIgnoreCase(reverse)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        // Count vowels and consonants
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < message.length(); i++) {
            char ch = Character.toLowerCase(message.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // Anagram check
        System.out.print("Enter first intercept: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second intercept: ");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        boolean isAnagram = true;

        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);

                int count1 = 0;
                int count2 = 0;

                for (int j = 0; j < str1.length(); j++) {
                    if (str1.charAt(j) == ch) {
                        count1++;
                    }
                    if (str2.charAt(j) == ch) {
                        count2++;
                    }
                }

                if (count1 != count2) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println("Both intercepts are Anagrams");
        } else {
            System.out.println("Both intercepts are NOT Anagrams");
        }

        // First non-repeating character
        System.out.print("Enter surveillance log: ");
        String log = sc.nextLine();

        char firstNonRepeat = ' ';
        boolean found = false;

        for (int i = 0; i < log.length(); i++) {
            int count = 0;

            for (int j = 0; j < log.length(); j++) {
                if (log.charAt(i) == log.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                firstNonRepeat = log.charAt(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("First Non-Repeating Character: " + firstNonRepeat);
        } else {
            System.out.println("No non-repeating character found");
        }

        sc.close();
    }
}
