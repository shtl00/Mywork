package oops.Polymorphism.methodOverLoading;


public class BankingOverloading {
    static int balance=1000;
    public static void main(String[] args) {
        //deposit 1000;
        //chritsmas 5
        BankingOverloading bankingOverloading=new BankingOverloading();
        String season="Chritsmas";

if (season=="normal"){
 bankingOverloading.deposit(1000);}

else if (season=="christmas")
 {bankingOverloading.deposit(100,
        5);}
    }
    public static void deposit(int depositMoney){
        balance = balance+depositMoney;
    }
    public static void deposit(int depositMoney, int cashbackPercentage){
        int cashback=depositMoney*cashbackPercentage/100;
        System.out.println("you get this cashback");
        balance=balance+(depositMoney+cashback);


}

}
