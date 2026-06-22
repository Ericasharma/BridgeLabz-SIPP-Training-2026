import java.util.*;
public class quotient_reminder {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=sc.nextInt();
        System.out.println("Enter second number : ");
        int b=sc.nextInt();
        int q=a/b;
        int r=a%b;
        System.out.println("The quptient and remainder of 2 tumbers are"+ q+" and "+r);
        sc.close();
    }
    
}
