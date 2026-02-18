package Feb2026.ex_10022016;

public class OOPs_challenge4 {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(5000);
        acc.withdraw(2000);
        acc.withdraw(4000);   // Invalid case

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else{
            System.out.println("Invalid operations like negative deposits");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid operations like negative deposits");
        }
       else if(amount>balance){
            System.out.println(" insufficient balance withdrawals.");
        }
       else{
           balance-=amount;
        }
    }

    public double getBalance() {
         return balance;
    }
}

