import java.util.Scanner;

class MathWizard {

    // Instance variable
    int instanceVar = 100;

    // Check Prime Number
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Factorial using iteration (int)
    public int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Overloaded factorial for double
    public double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int)n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Fibonacci Series
    public void fibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    // GCD using loop
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // LCM
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Power function
    public int power(int base, int exp) {
        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }

        return result;
    }

    // Scope demonstration
    public void showScope() {

        // Local variable
        int instanceVar = 50;

        System.out.println("Local Variable: " + instanceVar);
        System.out.println("Instance Variable: " + this.instanceVar);
    }
}

public class MathWizards {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MathWizard obj = new MathWizard();

        // Prime
        System.out.print("Enter number to check prime: ");
        int num = sc.nextInt();

        if (obj.isPrime(num)) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }

        // Factorial int
        System.out.print("Enter number for factorial: ");
        int factNum = sc.nextInt();
        System.out.println("Factorial: " + obj.factorial(factNum));

        // Factorial double
        System.out.print("Enter double number for factorial: ");
        double dNum = sc.nextDouble();
        System.out.println("Double Factorial: " + obj.factorial(dNum));

        // Fibonacci
        System.out.print("Enter number of terms for Fibonacci: ");
        int fib = sc.nextInt();
        obj.fibonacci(fib);

        // GCD and LCM
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD: " + obj.gcd(a, b));
        System.out.println("LCM: " + obj.lcm(a, b));

        // Power
        System.out.print("Enter base and exponent: ");
        int base = sc.nextInt();
        int exp = sc.nextInt();

        System.out.println("Power: " + obj.power(base, exp));
        obj.showScope();

        sc.close();
    }
}
