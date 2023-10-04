package oops.inheritance;

public class ClassC extends ClassB{
    public static void main(String[] args) {
        first();
        second();
        System.out.println(x);
        System.out.println(y);

        ClassB cb=new ClassB();
        System.out.println(cb.a);
        System.out.println(cb.b);


    }
}
