// DIP Solution:
// PaymentProcessor depends on the PaymentMethod abstraction.
// It no longer creates concrete payment classes directly.

interface PaymentMethod {
    void pay(double amount);
    String getPaymentName();
}

// Existing low-level class for e-wallet.
class EWallet {
    public void pay(double amount) {
        System.out.println("Processing e-wallet payment of " + amount);
    }
}

// Existing low-level class for credit card.
class CreditCard {
    public void charge(double amount) {
        System.out.println("Charging credit card with " + amount);
    }
}

// Adapter for e-wallet payment.
class EWalletPayment implements PaymentMethod {
    private EWallet eWallet;

    public EWalletPayment(EWallet eWallet) {
        this.eWallet = eWallet;
    }

    @Override
    public void pay(double amount) {
        eWallet.pay(amount);
    }

    @Override
    public String getPaymentName() {
        return "GCash";
    }
}

// Cash payment implementation.
class CashPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Receiving cash payment of " + amount);
    }

    @Override
    public String getPaymentName() {
        return "Cash";
    }
}

// Adapter for credit card payment.
class CreditCardPayment implements PaymentMethod {
    private CreditCard creditCard;

    public CreditCardPayment(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void pay(double amount) {
        creditCard.charge(amount);
    }

    @Override
    public String getPaymentName() {
        return "Credit Card";
    }
}

// Order stores the payment amount.
class Order {
    private double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

// High-level class depends on abstraction only.
class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(Order order) {
        paymentMethod.pay(order.getAmount());
        System.out.println("You are paying using " + paymentMethod.getPaymentName());
    }
}