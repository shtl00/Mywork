package conditionalStatments;

public class IfElse {
    public static void main(String[] args) {
        //conditional statement
        // if else
        int a = 20;
        int b = 30;

        if (a > b) {
            System.out.println("a is bigger");
        } else {
            System.out.println("b is bigger");
        }

        int marks = 100;

        if (marks > 50) {
            System.out.println("student is pass");
        } else {
            System.out.println("student is fail");
        }

        int withdraw = 2000;
        int balance = 1000;
        if (balance >= withdraw) {
            System.out.println("i can withdraw money");
        } else {
            System.out.println("i cannot withdraw money");

        }
    }}