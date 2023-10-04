package operators;

public class Logical {
    public static void main(String[] args) {
        int withdraw =  500;
        int balance = 5000;

        System.out.println("I will be able to withdraw :" );
        boolean iwillbeabletowithdraw =withdraw <= balance && balance >= 3000;
        System.out.println(iwillbeabletowithdraw);
        balance-=withdraw;
        System.out.println(balance);


    }
}
