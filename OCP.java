// OCP Solution:
// Customer no longer uses if-else for discount types.
// New discount types can be added without modifying Customer.

interface DiscountPolicy {
    double calculateDiscount(double amount);
}

// Discount for students.
class StudentDiscount implements DiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05;
    }
}

// Discount for senior citizens.
class SeniorCitizenDiscount implements DiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}

// Discount for regular customers.
class RegularDiscount implements DiscountPolicy {

    @Override
    public double calculateDiscount(double amount) {
        return 0.0;
    }
}

// Customer depends on abstraction, not fixed discount logic.
class Customer {
    private String name;
    private DiscountPolicy discountPolicy;

    public Customer(String name, DiscountPolicy discountPolicy) {
        this.name = name;
        this.discountPolicy = discountPolicy;
    }

    public String getName() {
        return name;
    }

    public double applyDiscount(double amount) {
        return amount - discountPolicy.calculateDiscount(amount);
    }
}