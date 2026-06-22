import java.util.*;
public class rocket_launch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int count=sc.nextInt();
        while(count>1){
            System.out.println(count);
            count--;
        }
        sc.close();

    }
    
}
