package conditionalStatments;

public class IfElseLadder {
    public static void main(String[] args) {
        //41-50=A
        //31-40=B
        //21-30=C
        //11-20= failed
        int marks = 35;

        if(marks<=50 && marks>=41){
            System.out.println("A grade");
        } else if (marks<=40 && marks>=31) {
            System.out.println("B grade");
            } else if (marks<=30 && marks >=21) {
            System.out.println("C grade");
            } else if (marks<=20) {
            System.out.println("failed");
        }
        int a = 100;
        int b= 200;
        int c= 300;
        int d = 100;

        if (a==d || d==b) {
            System.out.println("numbers are same");
        } else if (a > b && a > c) {
            System.out.println("a is bigger");
        } else if (b > a && b > c){
            System.out.println("b is bigger");
            } else if (c>a && c >b) {
            System.out.println("c is bigger");
        }

        }

    }


