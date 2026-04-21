package Encapsulation;

public class EncapsulationExample {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        System.out.println("Current Balance: " + account.getBalance());

        account.setBalance(10000);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}
