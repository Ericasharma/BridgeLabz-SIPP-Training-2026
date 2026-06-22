 import java.util.*;
 public class feet_to_yard_miles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your distance in feet: ");
        int feet=sc.nextInt();
        double yards=3*feet;
        double miles=1760*yards;
        System.out.println("Your distance in feet is "+feet+" while in yards is "+yards+" and miles is "+miles);
        sc.close();
    }
    
}


