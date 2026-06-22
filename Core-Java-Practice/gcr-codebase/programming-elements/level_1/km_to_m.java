import java.util.*;
public class km_to_m{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ditance in Kilometeres: ");
        int distance=sc.nextInt();
        double miles=1.6*distance;
        System.out.println("The total miles is "+miles+" mile for the given "+distance+"km");
        sc.close();
    }
}