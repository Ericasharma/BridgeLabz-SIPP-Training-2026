import java.util.*;
public class perimeter_square {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of square:");
        int side=sc.nextInt();
        int perimeter=4*side;
        System.out.println("The perimeter of given side is "+perimeter);
        sc.close();
    }
    
}
