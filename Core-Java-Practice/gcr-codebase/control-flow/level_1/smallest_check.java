import java.util.*;
public class smallest_check {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three  numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println("number 1 is smallest");
        }
        else{
            System.out.println("Not smallest");
        }sc.close();
    }
}
