package methods;

import javax.swing.*;

import static methods.ReturnTypeMethod.multiplicationOfTwoNumber;

public class ReturnTypeMthodTwo {
    static int balance = 1000;
    public static void main(String[] args) {
        monyewithdraw(200);
        System.out.println(balance);
        monyewithdraw(200);
        System.out.println(balance);
        moneyDeposit(400);
        System.out.println(balance);
        moneydeposit(500);
        System.out.println(balance);

        int totalinterest =interest(balance);
        System.out.println(totalinterest);



    }
    public static void monyewithdraw(int withdraw){
        balance = balance- withdraw;
    }
    public static void moneyDeposit(int deposit){
        balance = balance+ deposit;
    }
    public static void moneydeposit(int deposit){
        balance =balance+deposit;
    }
    public static int interest(int balance){
        int totalinterest=(balance *10)/100;
        return totalinterest;
    }

    }
