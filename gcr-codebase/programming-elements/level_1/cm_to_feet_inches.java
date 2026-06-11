import java.util.*;
public class cm_to_feet_inches {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        int height=sc.nextInt();
        double heightI=2.54*height;
        double heightF=12*heightI;
        System.out.println("Your Height in cm is "+height+" while in feet is "+heightF+" and inches is "+heightI);
        sc.close();
    }
    
}
