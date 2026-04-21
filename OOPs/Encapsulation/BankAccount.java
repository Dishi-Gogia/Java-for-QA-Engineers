package Encapsulation;

class BankAccount {

    private double balance = 5000;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }
}
