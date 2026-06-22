import java.util.*;
public class SpyAgency {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a secret code");
        String s=sc.nextLine();
        s=s.toLowerCase();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("Encoded Secret message is: "+rev);
        int left=0;
        int right=s.length()-1;
        boolean isPalindrome=true;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("Secret message is Plaindrome");
        }
        else{
            System.out.println("Secret message is not a palindrome");
        }
        //count vowel or consonants
        int vowel=0;
        int cons=0;
        
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i' ||s.charAt(i)=='o' || s.charAt(i)=='u'){
                    vowel++;
                }
                else{
                    cons++;
                }
                
            }
            
        }
        System.out.println("Vowels are : "+vowel);
        System.out.println("Consonants are : "+cons);
        sc.close();
    }
}
