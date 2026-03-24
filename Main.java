// This main class is optional.
// It is only for demonstrating that the code works.

public class Main {
    public static void main(String[] args) {

        // Question 1 test
        Dog dog = new Dog("Buddy", "Kim");
        Cat cat = new Cat("Mimi", "Kim");

        System.out.println(dog.makeSound());
        System.out.println(cat.eat());

        // Question 2 test
        Customer studentCustomer = new Customer("Kim", new StudentDiscount());
        Customer seniorCustomer = new Customer("Maria", new SeniorCitizenDiscount());
        Customer regularCustomer = new Customer("John", new RegularDiscount());

        System.out.println("Student final amount: " + studentCustomer.applyDiscount(1000));
        System.out.println("Senior final amount: " + seniorCustomer.applyDiscount(1000));
        System.out.println("Regular final amount: " + regularCustomer.applyDiscount(1000));

        // Question 3 test
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.makeCall("09123456789");
        basicPhone.sendSms("09123456789", "Hello");

        Samsung samsung = new Samsung();
        samsung.browseWeb("www.google.com");
        samsung.takePicture();

        Iphone iphone = new Iphone();
        iphone.makeCall("09987654321");
        iphone.takePicture();

        // Question 4 test
        Order order = new Order(1500.00);

        PaymentProcessor eWalletProcessor =
                new PaymentProcessor(new EWalletPayment(new EWallet()));
        eWalletProcessor.processPayment(order);

        PaymentProcessor cashProcessor =
                new PaymentProcessor(new CashPayment());
        cashProcessor.processPayment(order);

        PaymentProcessor creditCardProcessor =
                new PaymentProcessor(new CreditCardPayment(new CreditCard()));
        creditCardProcessor.processPayment(order);
    }
}