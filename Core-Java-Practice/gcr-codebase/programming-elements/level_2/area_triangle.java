import java.util.*;
public class area_triangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base: ");
        int base=sc.nextInt();
        System.out.println("Enter height: ");
        int height=sc.nextInt();
        double area=(1/2)*base*height;
        System.out.println("The area of triangle is "+area);
        sc.close();
        
    }
    
}
