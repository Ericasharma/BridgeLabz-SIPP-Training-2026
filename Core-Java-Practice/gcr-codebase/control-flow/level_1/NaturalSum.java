import java.util.*;
public class NaturalSum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Number is a natural number");
            int sum=num*(num+1)/2;
            System.out.println("sum is :"+sum);
        }
        else{
            System.out.println("Not a natural number");
        }
        sc.close();
        
    }   


}