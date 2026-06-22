import java.util.*;
public class Math_Wizard {
    class MathWizard{
        // Boolean
        public boolean isPrime(int n){
            if(n<=1){
                return false;
            }
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;

        }
        //Factorial
        public int factorial(int n){
            int fact=1;
            for(int i=n;i<=1;i--){
                fact=fact*i;
            }
            return fact;
        }
                public double factorial(double n){
            int fact=1;
            for(int i=int(n);i<=1;i--){
                fact=fact*i;
            }
            return fact;
        }
        //Fibonacci
        public int fibonacci(int n){
            int first=0;
            int second=1;
            System.out.println("Fibonacci Series:");

            for(int i=1;i<n;i++){
                System.out.print(first + " ");

                int next=first+second;
                first=second;
                second=next;

            }
            System.out.println();
        }
        //gcd
        public int gcd( int a, int b){
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            return a;
        }
        //LCM
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
    }
    public  static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        MathWizard obj= new MathWizard();
        
        

    }
    
}
