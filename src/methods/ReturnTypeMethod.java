package methods;

public class ReturnTypeMethod {
    public static void main(String[] args) {
        int c= sumOfTwoNumber(10,20);
        System.out.println(c);

        int z=multiplicationOfTwoNumber(10,10);
        System.out.println(z);

        c = divisionOfTwoNumber(50,10);
        System.out.println(c);
    }
    public static int sumOfTwoNumber(int a, int b){
        int c= a+b;
        return c;
    }
    public static int multiplicationOfTwoNumber(int x, int y){
        int z =x*y;
        return z;
    }

    public static int divisionOfTwoNumber(int a, int b){
        int c= a/b;
        return c;

    }
}
