package operators;

public class IncriDecriment {
    public static void main(String[] args) {
        //Incriment
        int a= 30;
        System.out.println(a);
        a++;
        System.out.println(a);
        System.out.println(a+4);

        //Decrement
        int b= 40;
        System.out.println(b);
        b--;
        System.out.println(b);
        System.out.println(b-9);

        // first assign then increase (print origional value then increase)
        int x=10;
        int y=20;
        x++;
        System.out.println(x);
        --y;
        System.out.println(y);
    }


}
