package operators;

public class Practise {
    public static void main(String[] args) {
    int balance= 1000;
    int withdraw= 700;

        System.out.println("i will be able to withdraw");
        boolean iwillbeabletowithdraw=withdraw<=balance && balance>=500;
        System.out.println("iwillbeabletowithdraw");
        balance-=withdraw;
        System.out.println(balance);


    }
}

