package Basic;

import java.util.Scanner;

public class ATM {
    private int balance = 1000;

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void deposit(int amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid deposit amount");
        }
        balance = balance + amount;
        System.out.println("Amount deposited");
    }

    void withdraw(int amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid withdrawal amount");
        }
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
            try {
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

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());

                if (sc.hasNextInt()) {
                    sc.nextInt();
                } else {
                    sc.next();
                }
            }
        }

        sc.close();
    }
}
//
//import java.util.Scanner;
//
//class InvalidAmountException extends Exception {
//    InvalidAmountException(String msg) {
//        super(msg);
//    }
//}
//
//public class ATM {
//    private int balance = 1000;
//
//    void checkBalance() {
//        System.out.println("Balance: " + balance);
//    }
//
//    void deposit(int amount) throws InvalidAmountException {
//        if (amount <= 0) {
//            throw new InvalidAmountException("Invalid deposit amount");
//        }
//        balance += amount;
//        System.out.println("Amount deposited");
//    }
//
//    void withdraw(int amount) throws InvalidAmountException {
//        if (amount <= 0) {
//            throw new InvalidAmountException("Invalid withdrawal amount");
//        }
//
//        if (amount > balance) {
//            throw new InvalidAmountException("Insufficient balance");
//        }
//
//        balance -= amount;
//        System.out.println("Amount withdrawn");
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ATM a = new ATM();
//        int ch = 0;
//
//        while (ch != 4) {
//            try {
//                System.out.println("\n1. Check Balance");
//                System.out.println("2. Deposit");
//                System.out.println("3. Withdraw");
//                System.out.println("4. Exit");
//                System.out.print("Enter choice: ");
//                ch = sc.nextInt();
//
//                if (ch == 1) {
//                    a.checkBalance();
//                } else if (ch == 2) {
//                    System.out.print("Enter amount: ");
//                    a.deposit(sc.nextInt());
//                } else if (ch == 3) {
//                    System.out.print("Enter amount: ");
//                    a.withdraw(sc.nextInt());
//                } else if (ch == 4) {
//                    System.out.println("Thank you!");
//                } else {
//                    System.out.println("Invalid choice");
//                }
//
//            } catch (InvalidAmountException e) {
//                System.out.println(e.getMessage());
//            } catch (java.util.InputMismatchException e) {
//                System.out.println("Please enter numbers only");
//                sc.nextLine();
//            }
//        }
//
//        sc.close();
//    }
//}
