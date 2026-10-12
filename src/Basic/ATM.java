import java.util.Scanner;

public class ATM {
    private int balance = 1000;

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Amount depositd");
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM a = new ATM();
        int ch = 0;

        while (ch != 4) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            if (ch == 1) {
                a.checkBalance();
            } else if (ch == 2) {
                System.out.print("Enter amount: ");
                a.deposit(sc.nextInt());
            } else if (ch == 3) {
                System.out.print("Enter amount: ");
                a.withdraw(sc.nextInt());
            } else if (ch == 4) {
                System.out.println("Thank you!");
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}