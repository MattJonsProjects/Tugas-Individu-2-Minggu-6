interface Payment {
    void pay(double amount);
}

class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid with cash: " + amount);
    }
}

class EWalletPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid with e-wallet: " + amount);
    }
}
