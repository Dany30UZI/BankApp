public class Client implements Bank {
    private String name;
    private int age;
    private long balance;

    public Client(String name, int age, long balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }
    public String toString() {
        return "Numele este " + name + ", Varsta de " + age + ", Balanta actuala " + balance;
    }

    @Override
    public long checkBalance() {
        return balance;
    }

    @Override
    public long deposit(long amount) {
        balance += amount;
        return balance;
    }

    @Override
    public long withdraw(long amount) {
        if (balance < amount){
            return balance;
        }else
            balance -= amount;
            return balance;
    }
}
