package Interfaces;

class UpiPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using UPI");
    }
}