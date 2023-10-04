package conditionalStatments;

public class ConditionalWithMethod {
    // desosite
    //withdraw
    public static int balance = 1500;//2000//1500//500//

    public static void main(String[] args) {

deposit(2500);
        withdraw(500);
        withdraw(1000);
        withdraw(500);

    }
    public static void deposit(int amount) {
        int totalBalance = balance + amount;
        System.out.println("your balance is" + balance);

    }

    public static void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println("yes you can withdraw money");
            balance = balance - amount;
        } else {
            System.out.println("sorry cannot withdraw money");
        }
    }
}