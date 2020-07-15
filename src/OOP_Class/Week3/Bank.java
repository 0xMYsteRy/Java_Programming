package OOP_Class.Week3;

class Bank {
    private int id;
    private int password;
    private int money;

    public Bank(int id,int password,int money) {
        this.id = id;
        this.password = password;
        this.money = money;
    }
}

class BankTest {
    public static void main(String[] args) {
        Bank account1 = new Bank(0,0,0);
        Bank account2 = new Bank(5,123,1000);

        // Private variable from a class cannot be access to the other class.
        // System.out.println(account2.money);
    }
}