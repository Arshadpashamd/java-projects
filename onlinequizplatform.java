import java.util.Scanner;

public class SimpleBankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name:   ");
        String name = scanner.nextLine();
        BankAccount account = new BankAccount(name);
        
        while(true) {
            System.out.println("\n Welcome, "+ account.getOwner() + "!");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Select an option:   ");
            int option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.  ");
            }
        }
    }
}

class BankAccount {
    private String owner;
    private double balance;
    
    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0.0;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance +=amount;
            System.out.println("Withdraw: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    
    public void checkBalance() {
        System.out.println("Current balance: $" +  balance);
    }
    
    public String getOwner() {
        return owner;
    }
}