package Practise;

class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void deposite(double amount){
        balance += amount;
    }

    public void withdraw(double withdrawBalance){
        if(withdrawBalance > balance){
            System.out.println("Insufficient funds!");
        }
        else{
            balance -= withdrawBalance;
        }
    }

    public void displayDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance " + balance);
    }

}






public class Attributes {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("9662375274869", 8655);
        account.deposite(5854);
        account.withdraw(9437);
        account.displayDetails();
        
    }

    
}

