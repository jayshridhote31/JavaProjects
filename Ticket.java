public class Account {
    double balance;
    Account(double balance) {
        this.balance = balance;
    }
    void transfer(Account target, double amount){
        if(this.balance >= amount) {
            this.balance -= amount;
            target.balance += amount;
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
public class BankApp {
    public static void main(String[] args){
        Account acc1 = new Account(5000);
        Account acc2 = new Account(2000);
        acc1.transfer(acc2, 1500);
        System.out.println("Acc 1 Balance: "+acc1.balance);
        System.out.println("Acc 2 Balance: "+acc2.balance);
    }
}
