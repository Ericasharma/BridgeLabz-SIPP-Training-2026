class BankAccount {
    String accountNumber;
    String holder;
    double balance;

    static int totalAccounts = 0;

    BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void getStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holder);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class Bank_Account {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("A101", "Rahul", 5000);
        BankAccount acc2 = new BankAccount("A102", "Priya", 7000);
        BankAccount acc3 = new BankAccount("A103", "Amit", 6000);

        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.withdraw(700);
        acc1.getStatement();

        acc2.deposit(1500);
        acc2.withdraw(2000);
        acc2.deposit(500);
        acc2.withdraw(1000);
        acc2.deposit(800);
        acc2.getStatement();

        acc3.deposit(1200);
        acc3.withdraw(500);
        acc3.withdraw(7000);
        acc3.deposit(1000);
        acc3.withdraw(300);
        acc3.getStatement();

        System.out.println("Total Accounts Created: " + BankAccount.totalAccounts);
    }
}