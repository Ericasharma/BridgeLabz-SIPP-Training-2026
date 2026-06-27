import java.util.Scanner;

public class  Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            service[i] = sc.nextDouble();

            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid Input! Enter again.");
                i--;
                continue;
            }
        }

        // Calculate Bonus and New Salary
        for (int i = 0; i < 10; i++) {

            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display Details
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary = " + salary[i] +
                    " | Bonus = " + bonus[i] +
                    " | New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Paid = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}