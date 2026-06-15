import java.util.*;
public class divisible_five{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num%5==0){
            System.out.println("Number is divisible by 5");
        }
        else{
            System.out.println("Not divisible by 5");
        }
        sc.close();
        
    }   


}