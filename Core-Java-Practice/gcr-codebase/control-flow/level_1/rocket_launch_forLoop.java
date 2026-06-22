import java.util.*;
public class rocket_launch_forLoop{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int count=sc.nextInt();
        for(int i=count;i>1;i--)
            System.out.println(count);
        
        sc.close();

    }
    
}
