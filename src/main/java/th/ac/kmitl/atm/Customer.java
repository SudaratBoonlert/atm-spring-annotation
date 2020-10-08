package th.ac.kmitl.atm;

public class Customer {
    private static String name;
    private int id;
    private int pin;
    private BankAccount account;

    public Customer(int id, String name, int pin) {
        this(id, name, pin, 0);
    }


    public Customer(int id, String name, int pin, double balance) {
        this.id = id;
        this.name = name;
        this.pin = pin;
        this.account = new BankAccount(id, name, balance);
    }
    public boolean checkPin(int inputPin) {
        return pin == inputPin;
    }

    public static String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public BankAccount getAccount() {
        return account;
    }
}
