package Interfaces;

public class InterfaceExample {

    public static void main(String[] args) {

        Payment payment1 = new CreditCardPayment();
        payment1.pay();

        Payment payment2 = new UpiPayment();
        payment2.pay();
    }
}