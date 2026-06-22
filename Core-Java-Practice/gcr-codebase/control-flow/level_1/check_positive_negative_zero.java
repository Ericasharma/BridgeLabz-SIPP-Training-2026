import java.util.*;
public class check_positive_negative_zero {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  number");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Number is postive");
        }
        else if(num<0){
            System.out.println("Number 2 is negative");
        }
        else{
            System.out.println("Number is zero");
        }
        sc.close();
    }
}
