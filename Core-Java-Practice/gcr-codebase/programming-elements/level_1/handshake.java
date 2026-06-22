import java.util.*;
public class handshake {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int max=(n*(n-1))/2;
        System.out.println("The possible numbber of maxium handshakes are: "+max);
        sc.close();
    }
}
