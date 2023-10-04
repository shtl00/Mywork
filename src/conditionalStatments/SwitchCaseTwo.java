package conditionalStatments;

import static conditionalStatments.ConditionalWithMethod.deposit;
import static conditionalStatments.ConditionalWithMethod.withdraw;

public class SwitchCaseTwo {
    public static void main(String[] args) {
      int a = 5;

      switch (a){
          case 1 :
              System.out.println("January");
              break;
          case 2:
              System.out.println("Feb");
              break;
          case 3:
              System.out.println("March");
              break;
          case 4:
              System.out.println("April");
              break;
          case 5:
              System.out.println("May");
          default:
              System.out.println("Month not in the list");
      }
int number=1;
      switch (number){
          case 1:
              System.out.println("you want to deposit");
              deposit(1000);
          case 2:
              System.out.println("you want to withdraw money");
              withdraw(200);

      }

    }
}


