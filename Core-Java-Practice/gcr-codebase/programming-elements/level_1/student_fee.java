import java.util.*;
public class student_fee {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter fees: ");
        int fees=sc.nextInt();
        System.out.print("Enter discount: ");
        double discount=sc.nextDouble();
        double discountA=(discount/100)*fees;
        double discountP=fees-discount;
        System.out.println("The discount amount is INR "+discountA+ " and final discounted fee is INR "+discountP);
        sc.close();
    }
}

