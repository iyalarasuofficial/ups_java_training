
package Day8;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
    }

    public int getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(5000);
        try {
            a1.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println("Available balance: " + a1.getBalance());
        }
    }
}
