import java.util.*;
public class tax_charges {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income:");
        double income=sc.nextDouble();
        if(income<=100000){
            double tax=0.05*income;
            System.out.println("Your tax is: " + tax);
        }
        else if(income>10000 && income<=50000){
            double tax=0.15*income;
            System.out.println("Your tax is: " + tax);
        }
        else{
            double tax=0.30*income;
            System.out.println("Your tax is: " + tax);
        }
        
        sc.close();
    }
    
}
