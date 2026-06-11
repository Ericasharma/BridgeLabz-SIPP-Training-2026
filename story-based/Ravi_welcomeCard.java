public class Ravi_welcomeCard {
    public static void main(String[] args) {
     int age = 25;
     String name = "Ravi";
     String rank= "Software Engineer";
     int salary = 50000;
     double memberahip_fee= 2204.50;
     double annual_bonus= (12*salary)/100;
     int bonus= (int) annual_bonus;
     
     System.out.println("Welcome to the coding guild, " + name + "!");
     System.out.println("Your age is: " + age);
     System.out.println("Your rank is: " + rank);   
    System.out.println("Your salary is: " + salary);
    System.out.println("Your annual bonus is: " + bonus);
    System.out.println("Your membership fee is: " + memberahip_fee);
    }
}